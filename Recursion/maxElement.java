import java.util.*;
public class maxElement {
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=maximum(arr,0);
        System.out.println(max);
       sc.close();
    }
    public static int maximum(int arr[],int idx)
    {
        if(idx==arr.length)
        {
            return Integer.MIN_VALUE;
        }
        int res=maximum(arr,idx+1);
        if(res>arr[idx])
        {
            return res;
        }
        else{
            return arr[idx];
        }
    }
}
