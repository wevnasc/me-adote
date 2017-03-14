package com.meadote.pets;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {
	
	List<Pet> findByOwnerId(Long ownerId);
	
}
