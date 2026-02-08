package Recursion;

import java.util.Scanner;

// fibonacci
public class Basic {
   static int fib(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        return fib(n-1)+fib(n-2);
    }
static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number: ");
    int n=sc.nextInt();
   for(int i=0;i<n;i++) {
       System.out.println(fib(i));
   }
}
}
