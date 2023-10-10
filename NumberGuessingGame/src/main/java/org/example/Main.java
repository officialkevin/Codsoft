package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
 static int n;
 static int num;
public static void guess(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter their guess for the generated number.");
    int m=sc.nextInt();
    n=m;
    loop();

}


public static void loop(){

    while (true){

        if (n<num){
            System.out.println("the guess is too low.");
            guess();
            break;
        }
        else if (n>num) {
            System.out.println("the guess is too high,");
            guess();
            break;
        }
        else {
            System.out.println("the guess is correct");
            break;
        }
    }
}

public static void main(String[] args) {
         Random rand = new Random();
        num=rand.nextInt(100);
        System.out.println(num);
        guess();

    }
}