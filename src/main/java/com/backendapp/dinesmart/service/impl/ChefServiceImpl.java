package com.backendapp.dinesmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.Chef;
import com.backendapp.dinesmart.repositories.ChefRepository;
import com.backendapp.dinesmart.service.ChefService;

@Service
public class ChefServiceImpl implements ChefService {

    @Autowired
    private ChefRepository chefRepository;

    @Override
    public Chef addChef(Chef chef) {
        return chefRepository.save(chef);
    }

    @Override
    public Chef updateChef(Chef chef) {
        return chefRepository.save(chef);
    }

    @Override
    public void deleteChef(int chefId) {
        chefRepository.deleteById(chefId);
    }

    @Override
    public List<Chef> getAllChefs() {
        return chefRepository.findAll();
    }

    @Override
    public Chef getChefById(int chefId) {
        return chefRepository.findById(chefId).get();
    }

    @Override
    public Chef getChefByChefUsernameAndChefPassword(String chefUsername, String chefPassword) {
        return chefRepository.findChefByChefUsernameAndChefPassword(chefUsername, chefPassword);
    }

}
