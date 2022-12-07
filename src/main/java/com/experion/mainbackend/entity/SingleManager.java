package com.experion.mainbackend.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="chittymanager")
@Getter
@Setter

public class SingleManager {
    @Id
    @Column(name="emp_id")
    private Long emp_id;


    @Column(name="emp_firstname")
    private String firstName;

    @Column(name="emp_lastname")
    private String emp_lastname;

    @Column(name="email")
    private String email;

}
