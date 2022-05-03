import java.util.*;
public class differenceArray {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int arr1[]=new int[n1];
    for(int i=0;i<n1;i++)
    {
       arr1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int arr2[]=new int[n2];
    for(int i=0;i<n2;i++)
    {
        arr2[i]=sc.nextInt();
    }
    int res[]=difference(arr1,arr2);
    for(int ans:res)
    {
        System.out.println(ans);
    }
    sc.close();
}
public static int[]difference(int arr1[],int arr2[])
{
int n1=arr1.length;
int n2=arr2.length;
int n3=Math.max(n1, n2);
int res[]=new int[n3];
int borrow=0;
int p1=n1-1;
int p2=n2-1;
int p3=n3-1;
while(p1>=0||p2>=0)
{
    int temp1=(p1>=0)?arr1[p1]:0;
    int temp2=(p2>=0)?arr2[p2]:0;
    temp2=temp2-borrow;
    int minus=0;
    if(temp2>=temp1)
    {
     minus=temp2-temp1;
     res[p3]=minus;
     borrow=0;
    }
    else{
        minus=(10+temp2)-temp1;
        borrow=1;
        res[p3]=minus;
    }
    p1--;
    p2--;
    p3--;
}
if(res[0]==0)
{
    int nres[]=new int[n3-1];
    for(int i=0;i<nres.length;i++)
    {
     nres[i]=res[i+1];
    }
return nres;
}
return res;

}
}
