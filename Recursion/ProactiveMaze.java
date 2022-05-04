import java.util.*;
public class ProactiveMaze {
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
        if(r==dr&&c==dc)
        {
            ArrayList<String>base1=new ArrayList<>();
            base1.add("");
            return base1;
        }
        ArrayList<String>myList=new ArrayList<>();
        if(c+1<=dc)
        {
            ArrayList<String>rres=maze(r,c+1,dr,dc);
            for(String s:rres)
            {
                myList.add("h"+s);
            }
        }
        if(r+1<=dr)
        {
            ArrayList<String>rres=maze(r+1,c,dr,dc);
            for(String s:rres)
            {
                myList.add("v"+s);
            }
        }
        return myList;
    }
}
