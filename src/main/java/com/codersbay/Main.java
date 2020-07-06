package com.codersbay;

import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");


//        checkEmailString("Totally_legit@email.com " +
//                "Almost.legit@sad.oRg " +
//                "sfaoij_=afj12_sad.com ");
//
//        printValidEmails("Totally_legit@email.com " +
//                        "Almost.legit@sad.oRg " +
//                        "sfaoij_=afj12_sad.com ");

        checkEmailString("goddammit@work_d.cm");
    }


    public static boolean checkEmailString(String emailToCheck) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9._]{5,}@[[a-zA-z0-9.]&&[^_]]+\\.[a-z]{2,6}$");
        Matcher matcher = pattern.matcher(emailToCheck);
        if (emailToCheck == "") {
            throw new IllegalArgumentException("Good like trying to find valid emails in an empty string");
        } else {
            return matcher.lookingAt();
        }
    }

    public static boolean printValidEmails(String stringToCheck) {
        Pattern pattern = Pattern.compile("[a-zA-z0-9._]+@[a-zA-z0-9.]+\\.[a-z]{2,6}");
        Matcher matcher = pattern.matcher(stringToCheck);
        if (stringToCheck == "") {
            throw new IllegalArgumentException("Good like trying to find valid emails in an empty string");
        } else {
            while (matcher.find()) {
                System.out.println("Valid email found: " + matcher.group());
            }
            return matcher.find();

        }
    }
}


