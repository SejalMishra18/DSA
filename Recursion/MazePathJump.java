import java.util.*;
public class MazePathJump {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int dr=sc.nextInt();
    int dc=sc.nextInt();
    ArrayList<String>fres=mazepath(1,1,dr,dc);
    System.out.println(fres);
    sc.close();
    }
    public static ArrayList<String>mazepath(int sr,int sc,int dr,int dc)
    {
        if(sr==dr&&sc==dc)
        {
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String>myList=new ArrayList<>();
        for(int i=1;i<=dc-sc;i++)//horizontally
        {
          ArrayList<String>res=mazepath(sr,sc+1,dr,dc);
          for(String s:res)
          {
          myList.add("h"+i+s);
          }
        }
        for(int j=1;j<=dr-sr;j++)//vertically
        {
          ArrayList<String>res=mazepath(sr+1,sc,dr,dc);
          for(String s:res)
          {
          myList.add("v"+j+s);
          }
        }
        for(int k=1;k<=dr-sr&&k<=dc-sc;k++)//diagonally
        {
          ArrayList<String>res=mazepath(sr+1,sc+1,dr,dc);
          for(String s:res)
          {
          myList.add("d"+k+s);
          }
        }
        return myList;
    }
}
