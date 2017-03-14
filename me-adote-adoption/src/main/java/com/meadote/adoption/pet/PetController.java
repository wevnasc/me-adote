package com.meadote.adoption.pet;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.meadote.adoption.owner.Owner;
import com.meadote.adoption.owner.OwnerNotFoundException;
import com.meadote.adoption.owner.OwnerRepository;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "owners/{ownerId}/pets")
public class PetController {

	private final PetRepository petRepository;
	private final OwnerRepository ownerRepository;

	@Autowired
	public PetController(PetRepository petRepository, OwnerRepository ownerRepository) {
		this.petRepository = petRepository;
		this.ownerRepository = ownerRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Resource<Pet>> findAll(@PathVariable Long ownerId) {
		this.validateOwner(ownerId);
		Collection<Pet> pets = petRepository.findByOwnerId(ownerId);
		return pets.stream().map(pet -> {
			return getPetResource(ownerId, pet);
		}).collect(Collectors.toList());
	}

	@RequestMapping(path = "/{petId}", method = RequestMethod.GET)
	public String findOne(@PathVariable long ownerId, @PathVariable long petId) {
//		this.validateOwner(ownerId);
//		Pet pet = petRepository.findOne(petId);
//		return getPetResource(ownerId, pet);
		return "teste";
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Resource<Pet> store(@PathVariable long ownerId, @RequestBody Pet input) {
		this.validateOwner(ownerId);
		Owner owner = ownerRepository.findOne(ownerId);
		input.setOwner(owner);
		Pet pet = petRepository.save(input);
		return getPetResource(ownerId, pet);
	}

	@RequestMapping(path = "/{petId}", method = RequestMethod.PUT)
	public Resource<Pet> update(@PathVariable long ownerId, @PathVariable long petId, @RequestBody Pet input) {
		this.validateOwner(ownerId);
		Pet pet = petRepository.findOne(petId);
		pet.setAge(input.getAge());
		pet.setBreed(input.getBreed());
		pet.setGender(input.getGender());
		pet.setName(input.getName());
		pet.setNotes(input.getNotes());
		pet.setWeight(input.getWeight());
		pet.setHeight(input.getHeight());
		pet.setAdopted(input.isAdopted());
		petRepository.save(pet);
		return getPetResource(ownerId, pet);

	}

	@RequestMapping(path = "/{petId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long ownerId, @PathVariable long petId) {
		this.validateOwner(ownerId);
		petRepository.delete(petId);
	}

	private Resource<Pet> getPetResource(long ownerId, Pet pet) {
		this.validateOwner(ownerId);
		Resource<Pet> petResource = new Resource<Pet>(pet);
		petResource.add(linkTo(methodOn(PetController.class).findOne(ownerId, pet.getId())).withSelfRel());
		return petResource;
	}

	private void validateOwner(long id) {
		this.ownerRepository.findById(id).orElseThrow(() -> new OwnerNotFoundException(id));
	}

}