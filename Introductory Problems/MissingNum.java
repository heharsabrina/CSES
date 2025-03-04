import java.util.Scanner;

public class MissingNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0, expected_sum=n*(n+1)/2, i;

        for(i=1;i<=n-1;i++)
            sum+=sc.nextLong();

        System.out.println(expected_sum-sum);

        sc.close();
    }
}
