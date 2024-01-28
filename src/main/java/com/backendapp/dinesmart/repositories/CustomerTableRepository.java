package com.backendapp.dinesmart.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.CustomerTable;

@Repository
public interface CustomerTableRepository extends JpaRepository<CustomerTable, Integer> {
    List<CustomerTable> findAllByCustomerTableStatus(boolean customerTableStatus);
}


