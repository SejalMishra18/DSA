import java.util.*;
public class minElement {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=minimum(arr,0);
        System.out.println(min);
       sc.close();
}
    public static int minimum(int arr[],int idx)
    {
        if(idx==arr.length)
        {
            return Integer.MAX_VALUE;
        }
        int res=minimum(arr,idx+1);
        if(res>arr[idx])
        {
            return arr[idx];
        }
        else{
            return res;
        }
    }
}
