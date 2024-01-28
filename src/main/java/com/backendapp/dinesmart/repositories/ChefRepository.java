package com.backendapp.dinesmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.Chef;

@Repository
public interface ChefRepository extends JpaRepository<Chef, Integer> {
    Chef findChefByChefUsernameAndChefPassword(String chefUsername, String chefPassword);
}
