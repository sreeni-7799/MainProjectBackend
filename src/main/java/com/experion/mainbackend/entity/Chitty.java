package com.experion.mainbackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chitty")
@Data
public class Chitty {

    @Id
    @Column(name = "chit_number")
    private Long chitNumber;

    @Column(name = "installment")
    private Long installment;

    @Column(name = "duration")
    private Long duration;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ChittyCategory category;

    @Column(name = "number_of_chittals")
    private int numberOfChittal;

    @Column(name = "total_amount")
    private Long totalAmount;

    @Column(name = "chitty_manager_id")
    private Long chittyManagerId;


}
