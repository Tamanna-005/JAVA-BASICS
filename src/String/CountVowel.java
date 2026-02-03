package String;
import java.util.*;
public class CountVowel {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your String: ");
    String s=sc.nextLine();
    int count=0;
    int cons=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            count++;
        }
        else {
            cons++;
        }
    }
    System.out.println("Total vowel in your String are: "+count);
    System.out.println("Total consonant in your String are: "+cons);
}
}
