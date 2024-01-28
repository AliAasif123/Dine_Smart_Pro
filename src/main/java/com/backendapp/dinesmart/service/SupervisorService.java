package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.Supervisor;

public interface SupervisorService {
    Supervisor addSupervisor(Supervisor supervisor);
    void deleteSupervisor(int supervisorId);
    List<Supervisor> getAllSupervisors();
    Supervisor getSupervisorBySupervisorId(int supervisorId);
    Supervisor updateSupervisor(Supervisor supervisor);
    Supervisor getSupervisorByUsernameAndPassword(String supervisorUsername, String supervisorPassword);
}
