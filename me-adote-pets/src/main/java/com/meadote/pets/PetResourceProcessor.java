package com.meadote.pets;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Component;

import com.meadote.pets.comments.CommentController;

@Component
public class PetResourceProcessor implements ResourceProcessor<Resource<Pet>> {

	@Override
	public Resource<Pet> process(Resource<Pet> resource) {
		resource.add(ControllerLinkBuilder.linkTo(CommentController.class).withRel("comments"));
		return resource;
	}	
	
}
