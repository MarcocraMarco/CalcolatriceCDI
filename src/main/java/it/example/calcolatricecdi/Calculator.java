package it.example.calcolatricecdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }


    public int subtraction(int a, int b) {
        return a - b;
    }


    public float division(int a, int b) {
        return (float) a / b;
    }


    public float product(int a, int b) {
        return (float) a * b;
    }
}


