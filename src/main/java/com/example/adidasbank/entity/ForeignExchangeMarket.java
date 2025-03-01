package com.example.adidasbank.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "foreign_exchange_market")
public class ForeignExchangeMarket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "currency_from")
    private String currencyFrom;

    @Column(name = "currency_to")
    private String currencyTo;

    @Column(name = "exchange_price")
    private Float exchangePrice;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

//    @Column(name = "id_currency")
//    private int idCurrency;

}
