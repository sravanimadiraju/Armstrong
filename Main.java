package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if armstrong or not ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (armstrong(number)==true){
            System.out.println(number+ " is armstrong number");
        }else{
            System.out.println(number +" is not armstrong number");
        }
    }
    public static boolean armstrong(int number){
        int noOfdigits=0;
        int givenNumber=0;
        givenNumber=number;
        for(;givenNumber!=0;givenNumber/=10){
            noOfdigits++;
        }
        int remainder=0,calcResult=0;
        givenNumber=number;
        for(;givenNumber!=0;givenNumber/=10){
            remainder=givenNumber%10;
            calcResult+=Math.pow(remainder,noOfdigits);
        }
        if(calcResult==number){
            return true;
        }
        else{
            return false;
        }
    }
}



