package com.meadote.adoption.pet;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("owners/{ownerId}/pets")
public class PetController {

//	private final PetRepository petRepository;
//	private final OwnerRepository ownerRepository;
//	
//
//	@Autowired
//	public PetController(PetRepository petRepository, OwnerRepository ownerRepository) {
//		this.petRepository = petRepository;
//		this.ownerRepository = ownerRepository;
//	}
	
	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> add(@PathVariable String ownerId, @RequestBody Pet input) {
		return null;
	}
	
}
