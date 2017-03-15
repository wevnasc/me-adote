package com.meadote.comments;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

	List<Comment> findByPetId(@Param("petId") Long petId);
	
}
