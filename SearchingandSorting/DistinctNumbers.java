package SearchingandSorting;

import java.io.*;
import java.util.*;

public class DistinctNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] numbers=br.readLine().split(" ");

        HashSet<Integer> set=new HashSet<>(n);

        for (int i=0;i<n;i++)
            set.add(Integer.parseInt(numbers[i]));
        

        System.out.println(set.size());
    }
}