import java.util.*;
public class firstandlastindex {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int fidx=firstidx(arr,k);
        int lidx=lastidx(arr,k);
       System.out.println(fidx);
       System.out.println(lidx);
        sc.close();
    }
    public static int firstidx(int arr[],int k)
    {
        int l=0;
        int h=arr.length-1;
        int temp=-1;
        while(l<=h)
        {
            int mid=(l+(h-l)/2);
            if(arr[mid]==k)
            {
               temp=mid;
                h=mid-1;
            }
            else if(arr[mid]<k)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return(temp);
    }
    public static int lastidx(int arr[],int k)
    {
        int l=0;
        int h=arr.length-1;
        int temp=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==k)
            {
               temp=mid;
                l=mid+1;
            }
            else if(arr[mid]<k)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return(temp);
    }
}
