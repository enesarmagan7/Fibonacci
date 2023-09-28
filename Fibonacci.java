package Letcode;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number;
        int fibonacci;
int a=0;
int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayısını girin : ");
        number=sc.nextInt();

        for(int i=0; i<number-2; i++){

            fibonacci=a+b;
            System.out.println(a+" + "+ b +" = "+ fibonacci  );
            a=b;
            b=fibonacci;

        }
    }
}
