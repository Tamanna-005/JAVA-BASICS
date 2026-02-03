package String;
import java.util.*;
public class RemoveSpace {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    StringBuilder sb = new StringBuilder();


     for (int i = 0; i < st.length(); i++) {

        char ch=st.charAt(i);
        if(ch!=' '){
            sb.append(st.charAt(i));
        }
    }
     System.out.println(sb.toString());
}
}
