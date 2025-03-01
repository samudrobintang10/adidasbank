package com.example.adidasbank.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private String gender;

    @Transient
    private  String rc;

    @Transient
    private  String rcDesc;
}
