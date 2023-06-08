package com.gripsaves.ConnectionCMS2.access;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private int age;
    private int Score;

    public Customer() {
    }

    public Customer(String name, int age, int score) {
        this.name = name;
        this.age = age;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Score=" + Score +
                '}';
    }
}
