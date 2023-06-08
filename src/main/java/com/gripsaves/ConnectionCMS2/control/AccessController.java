package com.gripsaves.ConnectionCMS2.control;

import com.gripsaves.ConnectionCMS2.access.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/access/customer")
public class AccessController {

    @GetMapping
    public List<Customer> accessPrint(){
        return List.of(
                new Customer("Julia", 18, 2)
        );
    }
}
