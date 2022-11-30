package com.experion.mainbackend.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id",nullable = false)
    private ChittyCategory category;

    @Column(name = "number_of_chittals")
    private int numberOfChittal;

    @Column(name = "total_amount")
    private Long totalAmount;

    @ManyToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "chitty_manager_id")
    private Manager manager;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name="date_started")
    @CreationTimestamp
    private Date dateStarted;

    public Chitty(Long chitNumber, Long installment, Long duration, ChittyCategory category, int numberOfChittal, Long totalAmount, Manager manager, Date dateCreated, Date dateStarted) {
        this.chitNumber = chitNumber;
        this.installment = installment;
        this.duration = duration;
        this.category = category;
        this.numberOfChittal = numberOfChittal;
        this.totalAmount = totalAmount;
        this.manager = manager;
        this.dateCreated = dateCreated;
        this.dateStarted = dateStarted;
    }

    public Chitty() {
    }
}
