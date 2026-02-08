package Loop;

import java.util.*;
// printing right angle triangle

/*public class Pattern {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of triangle: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
          for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}*/

// printing pyramid

public class Pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of pyramid: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){                   //*
            for(int j=i;j<n-1;j++){            //* *
                System.out.print(" ");        //* * *
            }

            for(int k=0;k<i;k++){
                System.out.print("*"+" ");
            }

            System.out.println();

        }

    }
}
