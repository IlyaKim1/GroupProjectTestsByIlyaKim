package com.junit.groupProject1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter operation");
        String operation = sc.next();
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                add(a,b);
                break;
            case "sub":
            case "-":
                System.out.println(sub(a,b));
                break;
            case "mul":
            case "*":
                System.out.println(mul(a,b));
                break;
            case "exp":
            case "^":
                System.out.println(exp(a,b));
                break;
            default:
                System.out.println("Please choose right operation");

        }

    }

    static void add(int num1, int num2){
        System.out.println(num1 + num2);
    }
    static int sub(int a, int b){
        return a - b;
    }

    static int mul(int a, int b){
        return a * b;
    }

    static int div(int a, int b){
        return a / b;
    }

    static int mod(int a, int b){
        return a % b;
    }

    static int exp(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        if(a < 0 && b != 3) {
            return -res;
        }else{
            return res;
        }
    }
}