package stringquestions;
import java.util.*;
public class pallindromestring {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        solution(str);
        sc.close();
    }
        public static void solution(String str)
        {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                String ss=str.substring(i,j);
                Boolean p=pallindrome(ss);
                if(p==true)
                {
                    System.out.println(ss);
                }
            }
        }
      }
      public static boolean pallindrome(String ss)
      {
          int l=0;
          int h=ss.length()-1;
          while(l<h)
          {
              if(ss.charAt(l)!=ss.charAt(h))
              {
             return false;
              }
              l++;
              h--;
          }
              return true;
      }

}
