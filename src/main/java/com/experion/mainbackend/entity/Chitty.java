package com.experion.mainbackend.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;
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
    @JsonIgnore
    private ChittyCategory category;

    @Column(name = "number_of_chittals")
    private int numberOfChittal;

    @Column(name = "total_amount")
    private Long totalAmount;



    @ManyToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "manager_emp_id")
    @JsonIgnore
    private Manager manager;

    @Column(name="launch_date")

    @CreationTimestamp
    private Date launchDate;

    @Column(name="start_date")
    @CreationTimestamp

    private Date launchDate;

    @Column(name="start_date")

    private Date startDate;

    public Chitty(Long chitNumber, Long installment, Long duration, ChittyCategory category, int numberOfChittal, Long totalAmount, Manager manager, Date launchDate, Date startDate) {
        this.chitNumber = chitNumber;
        this.installment = installment;
        this.duration = duration;
        this.category = category;
        this.numberOfChittal = numberOfChittal;
        this.totalAmount = totalAmount;
        this.manager = manager;
        this.launchDate = launchDate;
        this.startDate = startDate;
    }

    public Chitty() {
    }

    public Long getChitNumber() {
        return chitNumber;
    }

    public void setChitNumber(Long chitNumber) {
        this.chitNumber = chitNumber;
    }

    public Long getInstallment() {
        return installment;
    }

    public void setInstallment(Long installment) {
        this.installment = installment;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public ChittyCategory getCategory() {
        return category;
    }

    public void setCategory(ChittyCategory category) {
        this.category = category;
    }

    public int getNumberOfChittal() {
        return numberOfChittal;
    }

    public void setNumberOfChittal(int numberOfChittal) {
        this.numberOfChittal = numberOfChittal;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
