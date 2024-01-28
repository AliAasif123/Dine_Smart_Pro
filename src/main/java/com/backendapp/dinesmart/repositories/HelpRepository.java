package com.backendapp.dinesmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.Help;

@Repository
public interface HelpRepository extends JpaRepository<Help, Integer> {

}
