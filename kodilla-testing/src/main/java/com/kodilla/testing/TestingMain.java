package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator();

        String result = simpleUser.getUsername();
        int result1 = calculator.add(4, 10);
        int result2 = calculator.subtract(4, 10);


        if (result.equals("theForumUser")) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        if (result1 == 14) {
            System.out.println("test add ok");
        } else {
            System.out.println("error add");
        }

        if (result2 == -6) {
            System.out.println("test subtract ok");
        } else {
            System.out.println("error subtract");
        }
    }
}
