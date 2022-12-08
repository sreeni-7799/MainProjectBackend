package com.experion.mainbackend.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chittymanager")
@Getter
@Setter

public class Manager {

    @Id
    @Column(name="emp_id")
    private Long emp_id;


    @Column(name="emp_firstname")
    private String firstName;

    @Column(name="emp_lastname")
    private String emp_lastname;

    @Column(name="email")
    private String email;



    @OneToMany(cascade = CascadeType.ALL,mappedBy = "manager")
    private Set<Chitty> chits= new HashSet<>();

    public Manager(Long emp_id, String firstName, String emp_lastname, String email,Set<Chitty> chits) {

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "manager")
    private Set<Chitty> chits= new HashSet<>();

    public Manager(Long emp_id, String firstName, String emp_lastname, String email, Set<Chitty> chits) {

        this.emp_id = emp_id;
        this.firstName = firstName;
        this.emp_lastname = emp_lastname;
        this.email = email;
        this.chits = chits;
    }

    public Manager() {
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(String emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Set<Chitty> getChits() {
        return chits;
    }

    public void setChits(Set<Chitty> chits) {
        this.chits = chits;
    }
}
