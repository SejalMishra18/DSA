import java.util.*;
public class getStairPath {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>ans=stairs(n);
        System.out.println(ans);
        sc.close();
    }
    public static ArrayList<String>stairs(int n)
    {
        if(n==0)
        {
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String>mylist=new ArrayList<>();
        if(n>=1)
        {
            ArrayList<String>res=stairs(n-1);
            for(String s:res)
            {
                mylist.add("1"+s);
            }
        }
        if(n>=2)
        {
            ArrayList<String>res=stairs(n-2);
            for(String s:res)
            {
                mylist.add("2"+s);
            }
        }
        if(n>=3)
        {
            ArrayList<String>res=stairs(n-3);
            for(String s:res)
            {
                mylist.add("3"+s);
            }
        }
        return mylist;
    }
}
