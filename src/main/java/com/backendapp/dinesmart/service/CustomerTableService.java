package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.CustomerTable;

public interface CustomerTableService {
    CustomerTable addCustomerTable(CustomerTable customerTable);
    CustomerTable updateCustomerTable(CustomerTable customerTable);
    CustomerTable getCustomerTableById(int customerTableId);
    void deleteCustomerTable(int customerTableId);
    List<CustomerTable> getAllCustomerTables();
    List<CustomerTable> getAllCustomerTablesByCustomerTableStatus(boolean customerTableStatus);
    CustomerTable updateCustomerTableStatus(int customerTableId, boolean customerTableStatus);
}
