import java.util.*;
public class span {
 public static void main(String[]args)
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     int res=span1(arr);
     System.out.println(res);
     sc.close();
 }
 public static int span1(int arr[])
 {
     int min=arr[0];
     int max=arr[0];
     for(int i=1;i<arr.length;i++)
     {
         if(min>arr[i])
         {
             min=arr[i];
         }
     }
     for(int j=1;j<arr.length;j++)
     {
         if(max<arr[j])
         {
             max=arr[j];
         }
     }
     int ans=max-min;
     return ans;

 }
}
