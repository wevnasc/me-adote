package com.meadote.owners;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface OwnerRepository extends PagingAndSortingRepository<Owner, Long>{

    Owner findByEmail(@Param("email") String email);

}