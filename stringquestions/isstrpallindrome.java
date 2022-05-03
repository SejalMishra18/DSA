package stringquestions;
import java.util.*;
public class isstrpallindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(ispallin(str))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();

    }
    public static boolean ispallin(String str)
    {
        int l=0;
        int h=str.length()-1;
        while(l<h)
        {
            if(str.charAt(l)!=str.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}
