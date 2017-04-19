package com.meadote.pets;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {

	
}
