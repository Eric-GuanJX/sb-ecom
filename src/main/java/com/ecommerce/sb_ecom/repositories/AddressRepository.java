package com.ecommerce.sb_ecom.repositories;

import com.ecommerce.sb_ecom.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
