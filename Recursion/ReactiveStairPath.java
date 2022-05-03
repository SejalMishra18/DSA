import java.util.*;
public class ReactiveStairPath {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>res=stairs(n);
        System.out.println(res);
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
        if(n<0)
        {
            ArrayList<String>base1=new ArrayList<>();
            return base1;
        }
        ArrayList<String>mylist=new ArrayList<>();
        ArrayList<String>path1=stairs(n-1);
        ArrayList<String>path2=stairs(n-2);
        ArrayList<String>path3=stairs(n-3);
        for(String s:path1)
        {
          mylist.add("1"+s);
        }
        for(String s:path2)
        {
          mylist.add("2"+s);
        }
        for(String s:path3)
        {
          mylist.add("3"+s);
        }
        return mylist;

    }

}
