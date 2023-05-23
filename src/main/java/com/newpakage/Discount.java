package com.newpakage;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        float discount=0.0f;
        float netamount=0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a bill amount:");
        int billamount = sc.nextInt();
        if(billamount>10000){
            discount=billamount*0.1f;
        }
        netamount=billamount-discount;
        System.out.println("Bill amount is "+billamount);
        System.out.println("discount given is "+discount);
        System.out.println("net amount to be paid is "+netamount);
    }
}
