package com.experion.mainbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="userprofile")
public class UserRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    private Long id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="mobileno")
    private Long mobileNo;

    @Column(name="password")
    private String passWord;
}
