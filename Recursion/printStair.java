import java.util.*;
public class printStair {
  public static void main(String[]args)  
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      printStairs(n,"");
      sc.close();
  }
  public static void printStairs(int qsf,String asf)
  {
      if(qsf==0)
      {
       System.out.println(asf);
       return;
      }
     /* if(qsf<0)//reactive code
      {
          return;
      }
      printStairs(qsf-1,asf+"1");
      printStairs(qsf-2,asf+"2");
      printStairs(qsf-3,asf+"3");*/
      if(qsf>=1)
      {
       printStairs(qsf-1,asf+"1");
      }
      if(qsf>=2)
      {
       printStairs(qsf-2,asf+"2");
      }
      if(qsf>=3)
      {
       printStairs(qsf-3,asf+"3");
      }
  }
}
