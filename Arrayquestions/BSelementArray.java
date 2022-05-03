import java.util.*;
public class BSelementArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=findidx(arr,k);
        System.out.println(res);
        sc.close();
    }
    public static int findidx( int arr[],int k)
    {
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==k)
            {
             return mid;
            }
            else if(arr[mid]<k)
            {
                l=mid+1;
            }
        else{
            h=mid-1;
            }
        }
        return -1;
    }
}
