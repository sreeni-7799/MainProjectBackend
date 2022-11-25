package com.experion.mainbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    @Column(name="chitty_id")
    private Long chitty_id;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "manager")
    private Set<Chitty> chits;

    public Manager(Long emp_id, String firstName, String emp_lastname, String email, Long chitty_id, Set<Chitty> chits) {
        this.emp_id = emp_id;
        this.firstName = firstName;
        this.emp_lastname = emp_lastname;
        this.email = email;
        this.chitty_id = chitty_id;
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

    public Long getChitty_id() {
        return chitty_id;
    }

    public void setChitty_id(Long chitty_id) {
        this.chitty_id = chitty_id;
    }

    public Set<Chitty> getChits() {
        return chits;
    }

    public void setChits(Set<Chitty> chits) {
        this.chits = chits;
    }
}
