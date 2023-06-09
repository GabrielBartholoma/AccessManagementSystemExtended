package com.gripsaves.ConnectionCMS2.access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
public class Hacker {

    private static final String hackerName = "unknown";
    private static final int hackerAge = 999;
    private int hackerScore = 99;

    public Hacker() {
    }
}
