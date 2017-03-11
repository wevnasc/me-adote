package com.meadote.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.stream.Stream;

public class SeederUser implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {

        Stream.of("Dave", "Stephan", "Nina", "Oliver", "Mark")
                .forEach(name -> userRepository.save(new User(name, "test@test.com", "test")));
    }

    @Autowired
    private UserRepository userRepository;
}
