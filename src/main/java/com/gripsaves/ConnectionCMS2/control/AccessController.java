package com.gripsaves.ConnectionCMS2.control;

import com.gripsaves.ConnectionCMS2.access.Customer;
import com.gripsaves.ConnectionCMS2.service.AccessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/access/customer")
public class AccessController {

    private final AccessService accessService;
    private final Customer customer;
        public AccessController(AccessService accessService, Customer customer) {
        this.customer = customer;
        this.accessService = accessService;
    }

    @GetMapping ("/list")
    public List<Customer> accessPrint(){
        return List.of(
                new Customer("Julia", 18, 2)
        );
    }

    @GetMapping ("/increment")
    public int incrementCustomerScore(){
        System.out.println("AccessController: Current customer name: " + customer.getName());
        System.out.println("AccessController: Current customer score: " + customer.getScore());
        int customerScoreNumberToIncrement = customer.getScore();
        System.out.println("AccessController: Current local int customerScoreToIncrement: " + customerScoreNumberToIncrement);
        customerScoreNumberToIncrement = accessService.incrementCustomerScore(customerScoreNumberToIncrement);
        System.out.println("AccessController: Current local int customerScoreToIncrement (after inc.): " + customerScoreNumberToIncrement);
        System.out.println("AccessController: Current customer name: " + customer.getName());
        System.out.println("AccessController: Current customer score: " + customer.getScore());

        return customerScoreNumberToIncrement;
    }
}
