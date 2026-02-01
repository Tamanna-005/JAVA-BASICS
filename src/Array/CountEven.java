package Array;

import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your array length: ");
        int n = sc.nextInt();

        System.out.println("Enter you elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // printing elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.print("Total even number in array are : "+count);
    }
}
