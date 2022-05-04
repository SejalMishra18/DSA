import java.util.*;
public class printMazeJump {
    public static void main(String[]args)  
    {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        printMaze(1,1,dr,dc,"");
        sc.close();
    }
    public static void printMaze(int sr,int sc,int dr,int dc,String asf)
    {
        if(sr==dr&&sc==dc)
        {
            System.out.println(asf);
            return;
        }
        for(int i=1;i<=dc-sc;i++)
        {
         printMaze(sr,sc+1,dr,dc,asf+"h"+i);
        }
        for(int j=1;j<=dr-sr;j++)
        {
         printMaze(sr+1,sc,dr,dc,asf+"v"+j);
        }
        for(int k=1;k<=dc-sc&&k<=dr-sr;k++)
        {
            printMaze(sr+1,sc+1,dr,dc,asf+"d"+k);
        }
    }
}
