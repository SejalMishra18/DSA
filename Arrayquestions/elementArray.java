import java.util.*;
public class elementArray{

    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
          arr[i] =sc.nextInt();
    }
    int x=sc.nextInt();
    int res=find(arr,x);
    System.out.println(res);
    sc.close();
   }
   public static int find(int arr[],int x)
   { 
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==x)
         {
             return i;
         }
     }
         return -1;
   }
}
