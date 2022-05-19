package com.brigelabz;

import java.util.regex.Pattern;

public interface Firstname {
    void validUser(String name);
    }
    class RegexLambdaExpression {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        Firstname function = (name) -> {
            boolean check = Pattern.matches("([A-Z][a-z]{3,})", name);
            if (check == true) {
                System.out.println("Firstname is Valid");
            } else
                System.out.println("Enter valid name");
        };
        function.validUser("Praju");
    }
}





