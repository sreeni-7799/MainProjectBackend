package com.experion.mainbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chittymanager")
@Getter
@Setter
public class Product {

    @Id
    @Column(name="emp_id")
    private Long emp_id;


    @Column(name="emp_firstname")
    private String emp_firstname;

    @Column(name="emp_lastname")
    private String emp_lastname;

    @Column(name="email")
    private String email;

    @Column(name="chitty_id")
    private Long chitty_id;

    public Product(Long emp_id, String emp_firstname, String emp_lastname, String email, Long chitty_id) {
        this.emp_id = emp_id;
        this.emp_firstname = emp_firstname;
        this.emp_lastname = emp_lastname;
        this.email = email;
        this.chitty_id = chitty_id;
    }

    public Product() {
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_firstname() {
        return emp_firstname;
    }

    public void setEmp_firstname(String emp_firstname) {
        this.emp_firstname = emp_firstname;
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

}
