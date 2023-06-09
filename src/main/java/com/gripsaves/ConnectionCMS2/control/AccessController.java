package com.gripsaves.ConnectionCMS2.control;

import com.gripsaves.ConnectionCMS2.access.Customer;
import com.gripsaves.ConnectionCMS2.access.Hacker;
import com.gripsaves.ConnectionCMS2.service.AccessService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/access")
public class AccessController {

    private final AccessService accessService;
    private final Customer customer;
    private final Hacker hacker;

        public AccessController(AccessService accessService, Customer customer, Hacker hacker) {
        this.accessService = accessService;
        this.customer = customer;
        this.hacker = hacker;
        }

    @GetMapping ("/list")
    public List<Customer> accessPrint(){
        return List.of(
                new Customer("Julia", 18, 2)
        );
    }

    @GetMapping ("/increment/customer")
    public int incrementScoreCustomer(){
        //accessService.incrementScore();
       return customer.incrementScore();
    }

    @GetMapping ("/increment/hacker")
    public int incrementScoreHacker(){
        return hacker.incrementScore();
    }



}
