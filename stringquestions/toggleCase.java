package stringquestions;
import java.util.*;
public class toggleCase {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String ans=toggle(str);
        System.out.println(ans);
        sc.close();
    }
    public static String toggle(String str)
    {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z')
            {
              char up=(char)((ch-'a')+'A');//convert lowercase to uppercase;
              sb.append(up);
            }
            else
            {
                char lo=(char)((ch-'A')+'a');//convert uppercase to lowercase;
                sb.append(lo);
            }
        }
        return sb.toString();
    }
}
