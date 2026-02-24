package NumberSystem;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your decimal number: ");
        int decimal_number=sc.nextInt();
        int original=decimal_number;
        int ans=0;
        int pw=1;
        while(decimal_number>0){
            int parity =decimal_number%2;
            ans +=(parity * pw);
            pw *=10;
            decimal_number /= 2;
        }
        System.out.println("Binary value of "+ original+" is "+ans);
    }
}
