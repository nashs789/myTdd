package com.tdd.myTdd.PracticalUnitTest.ch01;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<Scoreable> scores = new ArrayList<>();

    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }

    public int arithmeticMean() {
        return scores.stream()
                     .mapToInt(Scoreable::getScore)
                     .sum() / scores.size();
    }
}
