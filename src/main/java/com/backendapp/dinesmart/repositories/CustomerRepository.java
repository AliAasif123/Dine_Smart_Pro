package com.backendapp.dinesmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
