package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.Chef;

public interface ChefService {
    Chef addChef(Chef chef);
    Chef updateChef(Chef chef);
    void deleteChef(int chefId);
    List<Chef> getAllChefs();
    Chef getChefById(int chefId);
    Chef getChefByChefUsernameAndChefPassword(String chefUsername, String chefPassword);
}
