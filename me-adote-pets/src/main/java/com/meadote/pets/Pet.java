package com.meadote.pets;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pet {

	public Pet(){}
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String breed;
    private String gender;
    private String notes;
    private int age;
    private boolean adopted;
    private double weight;
    private double height;
    
    @NotNull
    @Valid
    @JsonIgnore
    private Long OwnerId;
  
    public Pet(String name, String breed, String gender,String notes, int age,
    		boolean adopted, double weight, double height, long ownerId) {
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.notes = notes;
		this.age = age;
		this.adopted = adopted;
		this.weight = weight;
		this.height = height;
		this.OwnerId = ownerId;
	}



	public Long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getBreed() {
		return breed;
	}



	public String getGender() {
		return gender;
	}



	public String getNotes() {
		return notes;
	}



	public int getAge() {
		return age;
	}



	public boolean isAdopted() {
		return adopted;
	}



	public double getWeight() {
		return weight;
	}



	public double getHeight() {
		return height;
	}

	
	public Long getOwnerId() {
		return OwnerId;
	}
    
}
