package com.newpakage;

import java.util.Scanner;

public class GradeAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade:");
        int grade = sc.nextInt();
        if(grade>=1 && grade<=4){
            System.out.println("D");
        }
        else if(grade>=5 && grade<=6){
            System.out.println("C");
        }
        else if(grade>=7 && grade<=8){
            System.out.println("B");
        }
        else if(grade>=9 && grade<=10){
            System.out.println("A");
        }else{
            System.out.println("Fail");
        }
    }
}
