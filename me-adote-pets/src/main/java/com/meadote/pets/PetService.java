package com.meadote.pets;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PetService {
	
	private List<Pet> pets = Arrays.asList(
					new Pet(1, "Spring framework", "Framework Description"),
					new Pet(2, "Java", "Java Description"),
					new Pet(3, "Javascript", "Javascript Description"));
	
	public List<Pet> getAll(){
		return pets;
	}
		
	public Pet getBy(long id) {
		return pets.stream()
				.filter(pet -> pet.getId() == id)
				.findFirst()
				.get();
	}

}
