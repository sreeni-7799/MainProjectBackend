package com.experion.mainbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chittymanager")
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

    //    public Product(Integer productId, String productName, String productDesc, Double productPrice) {
//        this.productId = productId;
//        this.productName = productName;
//        this.productDesc = productDesc;
//        this.productPrice = productPrice;
//    }
//
//
//    public Product() {
//    }
//
//    public Integer getProductId() {
//        return productId;
//    }
//
//    public void setProductId(Integer productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public String getProductDesc() {
//        return productDesc;
//    }
//
//    public void setProductDesc(String productDesc) {
//        this.productDesc = productDesc;
//    }
//
//    public Double getProductPrice() {
//        return productPrice;
//    }
//
//    public void setProductPrice(Double productPrice) {
//        this.productPrice = productPrice;
//    }
}
