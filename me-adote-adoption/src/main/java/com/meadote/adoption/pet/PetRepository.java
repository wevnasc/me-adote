package com.meadote.adoption.pet;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PetRepository extends JpaRepository<Pet, Long> {
	
	Collection<Pet> findByOwnerId(long ownerId);
	
	Optional<Pet> findById(Long id);
	
}
