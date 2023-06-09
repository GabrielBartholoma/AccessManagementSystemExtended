

package com.gripsaves.ConnectionCMS2.access;

import com.gripsaves.ConnectionCMS2.service.AccessService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
public class Hacker implements AccessService {

    private static final String hackerName = "unknown";
    private static final int hackerAge = 999;
    private int Score = 99;

    public Hacker() {
    }

    @Override
    public int incrementScore() {
        Score = Score + 9999;
        return Score;
    }


}


