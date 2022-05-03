import java.util.*;
public class rotateArray {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int res[]=rotate(arr,k);
    for(int ans:res)
    {
        System.out.println(ans);
    }
    sc.close();
}

public static int[] p1(int arr[],int low,int high)
{ 
   while(low<high)
   {
       int temp=arr[low];
       arr[low]=arr[high];
       arr[high]=temp;
       low++;
       high--;
   }
   return arr;

}
public static int[] p2(int arr[],int low,int high)
{ 
   while(low<high)
   {
       int temp=arr[low];
       arr[low]=arr[high];
       arr[high]=temp;
       low++;
       high--;
   }
   return arr;

}
public static int[] p3(int arr[],int low,int high)
{ 
   while(low<high)
   {
       int temp=arr[low];
       arr[low]=arr[high];
       arr[high]=temp;
       low++;
       high--;
   }
   return arr;

}
public static int[] rotate(int arr[],int k)
{   
    k=k%arr.length;
    if(k<0)
    {
      k=k+arr.length;
    }
    p1(arr,0,arr.length-k-1);
    p2(arr,arr.length-k , arr.length-1);
    p3(arr,0,arr.length-1);
    return arr;
 
}

}
