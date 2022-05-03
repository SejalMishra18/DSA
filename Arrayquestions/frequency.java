import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        sc.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int count=0;
        while(n!=0)
        {
          int temp=n%10;
          if(temp==d)
          {
            count++;
          }
          n=n/10;
        }
        return count;
    }
}
