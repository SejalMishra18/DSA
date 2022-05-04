import java.util.*;
public class printSubsequence {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printSub(str,"");
        sc.close();
    }
    public static void printSub(String qsf,String asf)
    {
        if(qsf.length()==0)
        {
            System.out.println(asf);
            return;
        }
        char ch=qsf.charAt(0);
        String roq=qsf.substring(1);
        printSub(roq,asf+ch);
        printSub(roq,asf);
    }
}
