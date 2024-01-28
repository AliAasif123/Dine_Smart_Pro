package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.Customer;
import com.backendapp.dinesmart.Entities.Feedback;
import com.backendapp.dinesmart.Entities.Help;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerByCustomerId(int customerId);
    void deleteCustomer(int customerId);
    Customer addCustomerTableToCustomer(int customerId);
    List<Customer> getAllCustomersByOrderStatusId(int orderStatusId);
    Customer addFeedbackToCustomer(int customerId, Feedback feedback);
    Customer addHelpToCustomer(int customerId, Help help);
}
