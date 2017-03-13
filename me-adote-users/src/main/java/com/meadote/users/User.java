package com.meadote.users;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
=======

import javax.persistence.*;
import java.util.List;
>>>>>>> eda5a1c767375917a3993b8d6c8e700773e64225

@Entity
public class User {

    @Id
<<<<<<< HEAD
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private String password;

    public User() {

    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String email;
    private String uri;
    private String password;

    @OneToMany
    private List<Pet> pets;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
>>>>>>> eda5a1c767375917a3993b8d6c8e700773e64225
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
=======
    public void setName(String name) {
        this.name = name;
    }

>>>>>>> eda5a1c767375917a3993b8d6c8e700773e64225
    public String getEmail() {
        return email;
    }

<<<<<<< HEAD
=======
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

>>>>>>> eda5a1c767375917a3993b8d6c8e700773e64225
    public String getPassword() {
        return password;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
=======
    public void setPassword(String password) {
        this.password = password;
>>>>>>> eda5a1c767375917a3993b8d6c8e700773e64225
    }
}
