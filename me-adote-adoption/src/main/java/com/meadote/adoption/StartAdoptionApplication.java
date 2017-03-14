package com.meadote.adoption;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.meadote.adoption.owner.Owner;
import com.meadote.adoption.owner.OwnerRepository;
import com.meadote.adoption.pet.Pet;
import com.meadote.adoption.pet.PetRepository;

@SpringBootApplication
@EnableEurekaClient
public class StartAdoptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartAdoptionApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(OwnerRepository ownerRestRepository,
			PetRepository petRestRepository) {
		
		return (evt) -> Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
				.forEach(o -> {
					Owner owner = ownerRestRepository.save(new Owner(o));
					petRestRepository.save(new Pet("Brutos", "Buldogue", "Male", "", 5, false, 0.3, 0.4,  owner));
					petRestRepository.save(new Pet("Scoob", "Buldogue", "Male", "", 5, false, 0.3, 0.4,  owner));
				});
		
		
	}
}
