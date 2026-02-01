package String;
import java.util.*;
public class PalindromeCheck {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();

        int start=0;
        int end=s.length()-1;
        boolean ispalin=true;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                ispalin=false;
                break;

            }
            start++;
            end--;
        }
        if (ispalin) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }



    }
}
