package com.backendapp.dinesmart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.Cart;
import com.backendapp.dinesmart.Entities.Customer;
import com.backendapp.dinesmart.Entities.CustomerTable;
import com.backendapp.dinesmart.Entities.Feedback;
import com.backendapp.dinesmart.Entities.FoodOrder;
import com.backendapp.dinesmart.Entities.Help;
import com.backendapp.dinesmart.Entities.OrderStatus;
import com.backendapp.dinesmart.repositories.CartRepository;
import com.backendapp.dinesmart.repositories.CustomerRepository;
import com.backendapp.dinesmart.repositories.CustomerTableRepository;
import com.backendapp.dinesmart.repositories.FoodOrderRepository;
import com.backendapp.dinesmart.repositories.OrderStatusRepository;
import com.backendapp.dinesmart.service.CustomerService;
import com.backendapp.dinesmart.service.CustomerTableService;
import com.backendapp.dinesmart.service.SupervisorService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerTableService customerTableService;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private FoodOrderRepository foodOrderRepository;

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @Autowired
    private CustomerTableRepository customerTableRepository;

    @Autowired
    private SupervisorService supervisorService;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerByCustomerId(int customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public void deleteCustomer(int customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer addCustomerTableToCustomer(int customerId) {
        List<CustomerTable> customerTableList = customerTableRepository.findAllByCustomerTableStatus(false);

        CustomerTable customerTable = customerTableList.get(0);
        Customer customer = customerRepository.getById(customerId);
        customerTable.setCustomerTableStatus(true);
        customer.setCustomerTable(customerTable);
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomersByOrderStatusId(int orderStatusId) {
        OrderStatus orderStatus = orderStatusRepository.getById(orderStatusId);
        List<FoodOrder> foodOrderList = foodOrderRepository.findAllByOrderStatus(orderStatus);

        List<Customer> customerList = new ArrayList<>();
        for (FoodOrder foodOrder : foodOrderList) {
            Cart cart = cartRepository.findCartByFoodOrder(foodOrder);
            Customer customer = cart.getCustomer();
            if (!customerList.contains(customer)) {
                customerList.add(customer);
            }
        }
        return customerList;
    }

    @Override
    public Customer addFeedbackToCustomer(int customerId, Feedback feedback) {
        Customer customer = customerRepository.findById(customerId).get();
        customer.setFeedback(feedback);
        return customerRepository.save(customer);
    }

    @Override
    public Customer addHelpToCustomer(int customerId, Help help) {
        Customer customer = customerRepository.getById(customerId);
        customer.setHelp(help);
        return customerRepository.save(customer);
    }
}
