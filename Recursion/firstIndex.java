import java.util.*;
public class firstIndex {
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
        int index=fidx(arr,0,k);
        System.out.println(index);
       sc.close();
    }
    public static int fidx(int arr[],int idx,int k)
    {
        if(idx==arr.length)
        {
            return -1;
        }
         else if(arr[idx]==k)//if n=5 and here is not arr[5]then it will show out of bounds if we write else if condition befor if condition.
        {
            return idx;
        }
        int fans=fidx(arr,idx+1,k);
        return fans;
    }   
}
