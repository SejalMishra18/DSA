package stringquestions;
import java.util.*;

public class stringCompression {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String cmp1=compression1(str);
        String cmp2=compression2(str);
        System.out.println(cmp1);
       System.out.println(cmp2);
        sc.close();
    }
    public static String compression1(String str)
    { 
        StringBuilder sb=new StringBuilder();
        char c=str.charAt(0);
        sb.append(c);
      for(int i=1;i<str.length();i++)
      {
       if(str.charAt(i)==str.charAt(i-1))
       {
            continue;
       }
       else
       {
           sb.append(str.charAt(i));
       }
      }
      return sb.toString();
    }
    public static String compression2(String str)
    {
        StringBuilder sb=new StringBuilder();
        char c=str.charAt(0);
        sb.append(c);
        int count=1;
        for(int i=1;i<str.length();i++)
        {
           if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
                if(i==str.length()-1)
                {
                 sb.append(count);
                }
            }
            else{
                if(count==1)
                {
                sb.append(str.charAt(i));
                }
                else
                {
                sb.append(count);
                sb.append(str.charAt(i));
                count=1;
                }

            }
        }
        return sb.toString();
    }
    
}
