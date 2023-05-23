package com.newpakage;

import java.util.Scanner;

public class BillAmount {
    public static void main(String[] args) {
        int Baseamount=50;
        float amount=0.0f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount of water used:");
        int capacity= sc.nextInt();
        if(capacity>=1 && capacity<=2000){
            amount=Baseamount+capacity*0.1f;
        }
        else if(capacity>2000 && capacity<=3500){
            amount=Baseamount+capacity*0.2f;

        }else{
            amount=Baseamount+capacity*0.5f;
        }
        System.out.println(amount+"$");
    }
}
