import java.util.*;
public class allIndicesArraylist {
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
        ArrayList<Integer>fres=Indices(arr,n-1,k);
        if(fres.size()==0)
        System.out.println("No Output");
       else{
    System.out.println(fres);
       }
       sc.close();
    }  
    public static ArrayList <Integer> Indices(int arr[],int idx,int k)
    {
        if(idx==-1)
        {
        ArrayList<Integer>base=new ArrayList<>();
        return base;
        }
        ArrayList<Integer>rres=Indices(arr,idx-1,k);
        if(arr[idx]==k)
        {
          rres.add(idx);
          return rres;
        }
        else{
            return rres;
        }


    }
}
