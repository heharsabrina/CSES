import java.util.Scanner;

class WeirdAlgo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.print(n+" ");

        while(n!=1)
        {
            if(n%2==0)
                n=n/2;

            else
                n=(n*3)+1;
            System.out.print(n+" ");
        }
        
        sc.close();
    }
}