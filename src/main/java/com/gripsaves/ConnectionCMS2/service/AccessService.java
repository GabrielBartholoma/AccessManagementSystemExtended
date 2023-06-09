package com.gripsaves.ConnectionCMS2.service;

import com.gripsaves.ConnectionCMS2.access.Customer;
import org.springframework.stereotype.Service;

@Service
public class AccessService {

    private final Customer customer;

    public AccessService(Customer customer) {
        this.customer = customer;
    }

    public int incrementCustomerScore(int customerScoreNumberToIncrement) {
        int customerScoreToIncrement = customer.getScore();
        customer.setScore(customerScoreNumberToIncrement + 1);
        return customer.getScore();
    }
}
