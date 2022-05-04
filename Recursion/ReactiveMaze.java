import java.util.*;
public class ReactiveMaze {
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        ArrayList<String>res=maze(0,0,dr-1,dc-1);
        System.out.println(res);
        sc.close();
    }
    public static ArrayList<String>maze(int r,int c,int dr,int dc)
    {
        if(r>dr||c>dc)
        {
            ArrayList<String>base=new ArrayList<>();
            return base;
        }
        if(r==dr&&c==dc)
        {
            ArrayList<String>base1=new ArrayList<>();
            base1.add("");
            return base1;
        }
        ArrayList<String>myList=new ArrayList<>();
        ArrayList<String>hpath=maze(r,c+1,dr,dc);
        ArrayList<String>vpath=maze(r+1,c,dr,dc);
        for(String s:hpath)
        {
            myList.add("h"+s);
        }
        for(String s:vpath)
        {
            myList.add("v"+s);
        }
        return myList;
    }
}
