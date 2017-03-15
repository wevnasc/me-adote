package com.meadote.comments;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

	List<Comment> findByPetId(Long petId);
	
}
