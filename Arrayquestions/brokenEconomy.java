import java.util.*;
public class brokenEconomy {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        broken(arr,d);
        sc.close();
    }
    public static void broken(int arr[],int d)
    {
        int l=0;
        int h=arr.length-1;
        int ceil=0;
        int floor=0;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==d)
            {
            System.out.println(arr[mid]);
            return;
            }
            else if(arr[mid]<d)
            {
                l=mid+1;
                floor=arr[mid];
            }
            else{
               h=mid-1;
               ceil=arr[mid];
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}
