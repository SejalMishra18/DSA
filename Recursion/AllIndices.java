import java.util.*;
public class AllIndices {
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
        int farr[]=Indices(arr,0,k,0);
        if(farr.length==0)
        System.out.println("No Output");
       else{
           for(int res:farr)
           {
               System.out.println(res);
           }
       }
       sc.close();
    }  
    public static int[] Indices(int arr[],int idx,int k,int size)
    {
    if(idx==arr.length)
   {
    int arr1[]=new int[size];
    return arr1;
    }
   if(arr[idx]==k)
   {
    size++;
   }
   int ans[]=Indices(arr,idx+1,k,size);
   if(arr[idx]==k)
   {
       ans[size-1]=idx;
   }
   return ans;

    }
}
