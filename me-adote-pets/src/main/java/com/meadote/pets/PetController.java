package com.meadote.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @RequestMapping(value = "users/{userId}/pets", method = RequestMethod.GET)
    public List<Pet> getPetsByUser(@PathVariable("userId") long userId) {
        return petRepository.findByUserId(userId);
    }
}
