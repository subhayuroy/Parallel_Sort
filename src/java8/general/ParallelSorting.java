package java8.general;

import java.util.Arrays;

public class ParallelSorting
{
    public static void main(String args[])
    {
        int ints[] = new int[1000000];
        for (int i=0;i<ints.length;i++)
            ints[i]= (int)(Math.random()*1000000);
        int copy[] = ints.clone();
        long start, end;

        start = System.currentTimeMillis();
        Arrays.sort(ints);
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        Arrays.parallelSort(copy);
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}