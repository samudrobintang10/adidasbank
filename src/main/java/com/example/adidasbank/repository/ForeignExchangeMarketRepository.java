package com.example.adidasbank.repository;

import com.example.adidasbank.entity.ForeignExchangeMarket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignExchangeMarketRepository extends JpaRepository<ForeignExchangeMarket, Integer> {
    ForeignExchangeMarket findByCurrencyTo(String currencyTo);
    //    ForeignExchangeMarket findByCurrencyName (String currencyName);
    //    @Query("SELECT f.exchangePrice FROM ForeignExchangeMarket f WHERE f.idCurrencyTo = :currencyTo")
    //    Integer findExchangePriceByCurrencyTo(@Param("currencyTo") String currencyTo);

}
