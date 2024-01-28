package com.backendapp.dinesmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.CustomerTable;
import com.backendapp.dinesmart.repositories.CustomerTableRepository;
import com.backendapp.dinesmart.service.CustomerTableService;

@Service
public class CustomerTableServiceImpl implements CustomerTableService {

    @Autowired
    private CustomerTableRepository customerTableRepository;

    @Override
    public CustomerTable addCustomerTable(CustomerTable customerTable) {
        return customerTableRepository.save(customerTable);
    }

    @Override
    public CustomerTable updateCustomerTable(CustomerTable customerTable) {
        return customerTableRepository.save(customerTable);
    }

    @Override
    public CustomerTable getCustomerTableById(int customerTableId) {
        return customerTableRepository.findById(customerTableId).get();
    }

    @Override
    public void deleteCustomerTable(int customerTableId) {
        customerTableRepository.deleteById(customerTableId);
    }

    @Override
    public List<CustomerTable> getAllCustomerTables() {
        return customerTableRepository.findAll();
    }

    @Override
    public List<CustomerTable> getAllCustomerTablesByCustomerTableStatus(boolean customerTableStatus) {
        return customerTableRepository.findAllByCustomerTableStatus(customerTableStatus);
    }

    @Override
    public CustomerTable updateCustomerTableStatus(int customerTableId, boolean customerTableStatus) {
        CustomerTable customerTable = customerTableRepository.findById(customerTableId).get();
        customerTable.setCustomerTableStatus(customerTableStatus);
        return customerTableRepository.save(customerTable);
    }
}
