import java.util.*;
public class GetSubsequence {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String>ans=subsequence(str);
        System.out.println(ans);
        sc.close();
    }
    public static ArrayList<String> subsequence(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String>base=new ArrayList<>();
            base.add("");
         }
         String res=str.substring(1);
         char ch=str.charAt(0);
         ArrayList<String>rres=subsequence(res);
         ArrayList<String>mylist=new ArrayList<>();
         for(String s:rres)
         {
             mylist.add(s);
         }
         for(String s:rres)
         {
             mylist.add(ch+s);
         }
         return mylist;

    }
}
