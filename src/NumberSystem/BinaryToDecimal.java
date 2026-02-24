package NumberSystem;
import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your binary number: ");
        int binary_num=sc.nextInt();
        int original =binary_num;
        int ans=0; // converted decimal number
        int pw=1; // 2^0=1 power of 2 ..always at 0th index

        while(binary_num>0){
            int unit_digit = binary_num %10; // unit digit ke liye i.e last digit pkdne ke liye %
            ans +=(unit_digit*pw);
            binary_num /= 10 ; // to get next unit digit
  pw *= 2; // power inc krni hai by 2 by multiplying by 2

        }
        System.out.println("Decimal value for "+ original + " is " + ans);
    }
}
