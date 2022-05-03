package stringquestions;
import java.util.*;
public class consecutiveDifference {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String res=consecutive(str) ;
        System.out.println(res);
        sc.close();
       }
       public static String consecutive(String str)
       {
           StringBuilder sb=new StringBuilder();
           char c=str.charAt(0);
           sb.append(c);
           for(int i=1;i<str.length();i++)
           {
                 char ch=str.charAt(i-1);
                 char d=str.charAt(i);
                 int diff=d-ch;
                 sb.append(diff);
                 sb.append(d);
           }
           return sb.toString();
       }
}
