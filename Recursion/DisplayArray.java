import java.util.*;
public class DisplayArray{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        display(arr,n-1);
        sc.close();

    }
    public static void display(int arr[],int idx)
    {
        if(idx==-1)
        {
            return;
        }
        display(arr,idx-1);
        System.out.println(arr[idx]);
    }
}