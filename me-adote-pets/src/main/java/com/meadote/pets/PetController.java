package com.meadote.pets;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@RequestMapping("/pets")
	public List<Pet>  getAll() {
		return petService.getAll();
	}
	
	@RequestMapping("/pets/{id}")
	public Pet getById(@PathVariable long id) {
		return petService.getBy(id);
	}

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @RequestMapping(value = "users/{userId}/pets", method = RequestMethod.GET)
    public List<Pet> getPetsByUser(@PathVariable("userId") long userId) {
        return petRepository.findByUserId(userId);
    }
>>>>>>> eda5a1c767375917a3993b8d6c8e700773e64225
}
