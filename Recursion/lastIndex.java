import java.util.*;
public class lastIndex {
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
        int index=lidx(arr,n-1,k);
        System.out.println(index);
       sc.close();
    }
    public static int lidx(int arr[],int idx,int k)
    {
     if(idx==-1)
    {
        return -1;
    }
   else if(arr[idx]==k)
    {
        return idx;
    }
    
    int  fans=lidx(arr,idx-1,k);
    return fans;
    }
}
