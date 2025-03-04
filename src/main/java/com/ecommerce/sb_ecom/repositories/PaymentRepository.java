package com.ecommerce.sb_ecom.repositories;


import com.ecommerce.sb_ecom.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}