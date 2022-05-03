import java.util.*;
public class arrayInverse {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int res[]=(inverse(arr));
    for(int ans:res)
    {
        System.out.println(ans);
    }
    sc.close();
}
public static int[] inverse(int arr[])
{
   int arr1[]=new int[arr.length];
   for(int i=0;i<arr1.length;i++)
   {
       int temp=arr[i];
       arr1[temp]=i;
   }
  return arr1;
}
}
