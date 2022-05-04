import java.util.*;
public class pritnMaze {
    public static void main(String[]args)  
    {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        printMaze(0,0,dr-1,dc-1,"");
        sc.close();
    }
    public static void printMaze(int sr,int sc,int dr,int dc,String asf)
    {
        if(dr==sr&&dc==sc)
        {
            System.out.println(asf);
            return;
        }
      /*  if(sr>dr||sc>dc)//reactive code
        {
            return;
        }
        printMaze(sr,sc+1,dr,dc,asf+"h");
        printMaze(sr+1,sc,dr,dc,asf+"v");
    }*/
    if(sc+1<=dc)
    {
        printMaze(sr,sc+1,dr,dc,asf+"h");
    }
    if(sr+1<=dr)
    {
        printMaze(sr+1,sc,dr,dc,asf+"v");
    }
}
}
