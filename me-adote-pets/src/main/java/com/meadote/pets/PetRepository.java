package com.meadote.pets;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {

    List<Pet> findByUserId(long userId);

}
