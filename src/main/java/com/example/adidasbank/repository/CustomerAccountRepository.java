package com.example.adidasbank.repository;

import com.example.adidasbank.entity.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long> {

    // Mencari akun berdasarkan ID Customer (User)
//    List<CustomerAccount> findByCustomer_Id(Long idUser);

    // Mencari akun berdasarkan Nomor Akun
    CustomerAccount findByAccountNumber(String accountNumber);
}
