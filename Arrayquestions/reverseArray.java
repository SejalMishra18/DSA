import java.util.*;
public class reverseArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
       }
       int res[]=reverse(arr);
       for(int ans:res)
       {
           System.out.println(ans);
       } 
       sc.close();
    }
    public static int []reverse(int arr[])
    {
     int low=0;
     int high=arr.length-1;
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
}
