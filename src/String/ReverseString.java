package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.print("Enter your String: ");
        String s=sc.nextLine();
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--){
  rev+=s.charAt(i);
        }
System.out.print("Reversed String is: "+rev);


    }
}
