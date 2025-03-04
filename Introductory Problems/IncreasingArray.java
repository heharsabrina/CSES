import java.util.Scanner;

public class IncreasingArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        long count=0;
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        for(i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i])
            {
                count+=arr[i-1]-arr[i];
                arr[i] = arr[i-1];
            }
        }
        System.out.println(count);
    }
}