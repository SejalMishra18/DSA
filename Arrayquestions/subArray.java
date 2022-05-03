import java.util.*;
public class subArray {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    sub(arr);
    sc.close();
    }
    public static void sub(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }
    }

}
