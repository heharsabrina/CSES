import java.math.BigInteger;
import java.util.Scanner;

public class BitStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        final int MOD = 1_000_000_007;
        BigInteger result = BigInteger.valueOf(2).modPow(BigInteger.valueOf(n), BigInteger.valueOf(MOD));
        System.out.println(result);
    }
}
