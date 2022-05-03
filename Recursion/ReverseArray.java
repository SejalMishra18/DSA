import java.util.*;
public class ReverseArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        reverse(arr,n-1);
        sc.close();
    }
    public static void reverse(int arr[],int idx)
    {
        if (idx==-1)
        {
            return;
        }
        System.out.println(arr[idx]);
        reverse(arr,idx-1);
    }
}

