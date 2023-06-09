package com.gripsaves.ConnectionCMS2.access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
public class Customer {

    private String name;
    private int age;
    private int Score;

    public Customer() {
    }
}

