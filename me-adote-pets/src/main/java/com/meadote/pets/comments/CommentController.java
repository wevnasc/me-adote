package com.meadote.pets.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

	@Autowired
	private CommentClient commentClient;
	
	@RequestMapping(value = "/pets/{id}/comments", method = RequestMethod.GET, produces = "application/json")
	 public Resources<Comment> findAllComments(@PathVariable long id) {
        return commentClient.findAll(id);
    }
	
}