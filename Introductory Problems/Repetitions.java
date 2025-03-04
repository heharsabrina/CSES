import java.util.Scanner;

public class Repetitions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String dna = sc.next();
        sc.close();
        
        int maxCount = 1, currCount = 1, i;

        for (i=1;i<dna.length();i++)
        {
            if(dna.charAt(i)==dna.charAt(i - 1))
                currCount++;
            else
                currCount=1;
            maxCount = Math.max(maxCount,currCount);
        }
        System.out.println(maxCount);
    }
}
