package com.backendapp.dinesmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendapp.dinesmart.Entities.Supervisor;

public interface SupervisorRepository extends JpaRepository<Supervisor, Integer> {
    Supervisor findSupervisorBySupervisorUsernameAndSupervisorPassword(String supervisorUsername, String supervisorPassword);
} 