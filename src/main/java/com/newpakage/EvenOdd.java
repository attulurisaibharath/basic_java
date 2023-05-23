package com.newpakage;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a vaild number:");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("The given number is even "+num);
        }else{
            System.out.println("The given  number is odd "+num);
        }
    }
}
