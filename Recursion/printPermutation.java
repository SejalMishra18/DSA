import java.util.*;
public class printPermutation {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printPer(str,"");
        sc.close();
    }
    public static void printPer(String qsf,String asf)
    {
        if(qsf.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<qsf.length();i++)
        {
        char ch=qsf.charAt(i);
        StringBuilder sb=new StringBuilder(qsf);
         sb.deleteCharAt(i);
        String roq=sb.toString();
        printPer(roq,asf+ch);
        }

    }

}
