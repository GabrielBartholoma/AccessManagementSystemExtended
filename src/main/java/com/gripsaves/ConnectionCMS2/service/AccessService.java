package com.gripsaves.ConnectionCMS2.service;

import com.gripsaves.ConnectionCMS2.access.Customer;
import com.gripsaves.ConnectionCMS2.access.Hacker;
import org.springframework.stereotype.Service;

@Service
public class AccessService {

    private final Customer customer;
    private final Hacker hacker;

    public AccessService(Customer customer, Hacker hacker) {
        this.customer = customer;
        this.hacker = hacker;
    }

    public int incrementCustomerScore(int customerScoreNumberToIncrement) {
        int customerScoreToIncrement = customer.getScore();
        customer.setScore(customerScoreNumberToIncrement + 1);
        return customer.getScore();
    }
}
