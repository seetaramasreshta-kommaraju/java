//package com.demo;

import java.util.Scanner;

interface Retirement {
    int calculateRetirementAge(int age);
}

class RetirementCountDown implements Retirement {

    public int calculateRetirementAge(int age) {
        int ret_age = 65;
        int years_left = ret_age - age;
        return years_left;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RetirementCountDown rc = new RetirementCountDown();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        int result = rc.calculateRetirementAge(age);

        System.out.println(result + " years left for retirement!");

        sc.close();
    }
}