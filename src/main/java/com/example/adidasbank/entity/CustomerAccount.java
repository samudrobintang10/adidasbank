package com.example.adidasbank.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_accounts")
public class CustomerAccount {
    @Id
    @Column(name = "id")
    private Integer id;

//    @Column(name = "id_user")
//    private Customer customer;

    @Column(name = "currency")
    private String currency;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "balance")
    private Double balance;

}

