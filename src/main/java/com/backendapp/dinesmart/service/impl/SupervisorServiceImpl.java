package com.backendapp.dinesmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.Supervisor;
import com.backendapp.dinesmart.repositories.SupervisorRepository;
import com.backendapp.dinesmart.service.SupervisorService;

@Service
public class SupervisorServiceImpl implements SupervisorService {

    @Autowired
    private SupervisorRepository supervisorRepository;

    @Override
    public Supervisor addSupervisor(Supervisor supervisor) {
        return supervisorRepository.save(supervisor);
    }

    @Override
    public void deleteSupervisor(int supervisorId) {
        supervisorRepository.deleteById(supervisorId);
    }

    @Override
    public List<Supervisor> getAllSupervisors() {
        return supervisorRepository.findAll();
    }

    @Override
    public Supervisor updateSupervisor(Supervisor supervisor) {
        return supervisorRepository.save(supervisor);
    }

    @Override
    public Supervisor getSupervisorByUsernameAndPassword(String supervisorUsername, String supervisorPassword) {
        return supervisorRepository.findSupervisorBySupervisorUsernameAndSupervisorPassword(supervisorUsername, supervisorPassword);
    }

    @Override
    public Supervisor getSupervisorBySupervisorId(int supervisorId) {
        return supervisorRepository.findById(supervisorId).get();
    }
}
