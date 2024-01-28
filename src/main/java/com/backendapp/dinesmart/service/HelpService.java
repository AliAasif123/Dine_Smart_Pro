package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.Help;

public interface HelpService {
    Help addHelp(Help help);
    Help updateHelp(Help help);
    Help getHelpById(int helpId);
    void deleteHelp(int helpId);
    List<Help> getAllHelps();
    Help updateHelpStatus(int helpId, boolean helpStatus);
}
