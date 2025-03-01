package com.example.adidasbank.service;

import com.example.adidasbank.entity.ForeignExchangeMarket;
import com.example.adidasbank.repository.ForeignExchangeMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeignExchangeMarketService {
    @Autowired
    private ForeignExchangeMarketRepository foreignExchangeMarketRepository;

    // Menambahkan data baru
    public ForeignExchangeMarket addExchangeMarket(ForeignExchangeMarket market) {
        return foreignExchangeMarketRepository.save(market);
    }

    // Mengambil semua data
    public List<ForeignExchangeMarket> getAllExchangeMarkets() {
        return foreignExchangeMarketRepository.findAll();
    }

    // Mengambil data berdasarkan ID
    public ForeignExchangeMarket getExchangeMarketById(Integer id) {
        return foreignExchangeMarketRepository.findById(id).get();
    }

    public ForeignExchangeMarket getExchangePrice(String currencyTo) {
        // Mengambil nilai tukar berdasarkan mata uang yang diminta
        return foreignExchangeMarketRepository.findByCurrencyTo(currencyTo);
    }

    // Menghapus data
    public void deleteExchangeMarket(int id) {
        foreignExchangeMarketRepository.deleteById(id);
    }
//    public Integer getExchangeRate(String currencyTo) {
//        // Ambil nilai tukar dari database berdasarkan currencyTo
//        ForeignExchangeMarket market = foreignExchangeMarketRepository.findByCurrencyTo(currencyTo);
//        return market != null ? market.getE() : null;
//    }
}
