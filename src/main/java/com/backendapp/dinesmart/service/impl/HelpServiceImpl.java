package com.backendapp.dinesmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.Help;
import com.backendapp.dinesmart.Entities.Supervisor;
import com.backendapp.dinesmart.repositories.HelpRepository;
import com.backendapp.dinesmart.repositories.SupervisorRepository;
import com.backendapp.dinesmart.service.HelpService;

@Service
public class HelpServiceImpl implements HelpService {

    @Autowired
    private HelpRepository helpRepository;

    @Autowired
    private SupervisorRepository supervisorRepository;

    @Override
    public Help addHelp(Help help) {
        Supervisor supervisor = supervisorRepository.findById(1).get();
        help.setSupervisor(supervisor);
        return helpRepository.save(help);
    }

    @Override
    public Help updateHelp(Help help) {
        return helpRepository.save(help);
    }

    @Override
    public Help getHelpById(int helpId) {
        return helpRepository.findById(helpId).get();
    }

    @Override
    public void deleteHelp(int helpId) {
        helpRepository.deleteById(helpId);
    }

    @Override
    public List<Help> getAllHelps() {
        List<Help> helpList = helpRepository.findAll();
        helpList.removeIf(Help::isHelpStatus);
        return helpList;
    }

    @Override
    public Help updateHelpStatus(int helpId, boolean helpStatus) {
        Help help = helpRepository.getById(helpId);
        help.setHelpStatus(helpStatus);
        return helpRepository.save(help);
    }
}
