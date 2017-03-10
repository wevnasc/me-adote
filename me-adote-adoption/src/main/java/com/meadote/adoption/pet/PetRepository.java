package com.meadote.adoption.pet;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
	
	Collection<Pet> findByOwnerId(long ownerId);
	
}
