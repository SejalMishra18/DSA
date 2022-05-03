import java.util.*;
public class sumArray {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int arr1[]=new int[n1];
    for(int i=0;i<arr1.length;i++)
    {
     arr1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int arr2[]=new int[n2];
    for(int i=0;i<arr2.length;i++)
    {
     arr2[i]=sc.nextInt();
    }
    int finalarr []=addition(arr1,arr2);
    for(int res:finalarr)
    {
        System.out.println(res);
    }
    sc.close();
}
public static int[] addition(int arr1[],int arr2[])
{
    int n1=arr1.length-1;
    int n2=arr2.length-1;
    int n3=Math.max(n1, n2);
    int res[]=new int[n3];
    int c=0;
    int p1=n1-1;
    int p2=n2-1;
    int p3=n3-1;
    while(p1>=0||p2>=0)
    {
        int temp1=(p1>=0)?arr1[p1]:0;
        int temp2=(p2>=0)?arr2[p2]:0;
        int sum=temp1+temp2+c;
        int digit=sum%10;
        c=sum/10;
        res[p3]=digit;
        p1--;
        p2--;
        p3--;
    }
    if(c!=0)
    {
        int nres[]=new int[n3+1];
        nres[0]=c;
       for(int i=1;i<nres.length;i++)
       {
           nres[i]=res[i-1];
       }
       return nres;
    }
    return res;
}

}
