package com.example.adidasbank.controller;

import com.example.adidasbank.entity.ForeignExchangeMarket;
import com.example.adidasbank.repository.ForeignExchangeMarketRepository;
import com.example.adidasbank.service.ForeignExchangeMarketService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AdidasBankController {

    @Autowired
    private ForeignExchangeMarketService foreignExchangeMarketService;

    // Endpoint untuk menambahkan data baru
    @PostMapping
    public ResponseEntity<ForeignExchangeMarket> addExchangeMarket(@RequestBody ForeignExchangeMarket market) {
        ForeignExchangeMarket createdMarket = foreignExchangeMarketService.addExchangeMarket(market);
        return ResponseEntity.ok(createdMarket);
    }

    // Endpoint untuk mengambil semua data
    @GetMapping
    public ResponseEntity<List<ForeignExchangeMarket>> getAllExchangeMarkets() {
        List<ForeignExchangeMarket> markets = foreignExchangeMarketService.getAllExchangeMarkets();
        return ResponseEntity.ok(markets);
    }

    // Endpoint untuk mengambil data berdasarkan ID
    @GetMapping("/getForeignExchangeMarket/{id}")
    public ResponseEntity<ForeignExchangeMarket> getExchangeMarketById(@PathVariable Integer id) {
        ForeignExchangeMarket market = foreignExchangeMarketService.getExchangeMarketById(id);
        return ResponseEntity.ok(market);
//        return market != null ? ResponseEntity.ok(market) : ResponseEntity.notFound().build();
    }

//    @GetMapping("/getForeignExchangeMarket/{currencyTo}")
//    public ResponseEntity<ForeignExchangeMarket> getExchangePrice(@PathVariable String currencyTo) {
//        ForeignExchangeMarket exchangePrice = foreignExchangeMarketService.getExchangePrice(currencyTo);
//
//        if (exchangePrice != null) {
//            return ResponseEntity.ok(exchangePrice);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}


// Endpoint untuk menghapus data
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteExchangeMarket(@PathVariable int id) {
//        foreignExchangeMarketService.deleteExchangeMarket(id);
//        return ResponseEntity.noContent().build();
//    }
