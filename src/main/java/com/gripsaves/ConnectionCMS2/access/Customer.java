package com.gripsaves.ConnectionCMS2.access;

import com.gripsaves.ConnectionCMS2.service.AccessService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@Primary
public class Customer implements AccessService {

    private String name;
    private int age;
    private int score;

    public Customer() {
    }


    @Override
    public int incrementScore() {
        score = score + 1;
        System.out.println("Customer: Score is: " + score);
        return score;
    }
}

