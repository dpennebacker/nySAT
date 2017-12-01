package com.company;

import java.util.Arrays;


public class methods {

    public static int rankScores [];


    public static void getRank(schools[] a, int c )
    {

        for(int t = 0; t < c; t++)
        {

            if (a[t].rank == 1)
                System.out.println("First is: " + a[t].schoolName);
            else if (a[t].rank == 2) {
                System.out.println("Second is: " + a[t].schoolName);
            } else if (a[t].rank == 3) {
                System.out.println("Third is: " + a[t].schoolName);
            }


        }
    }

    /*public static void estRankArray(int a [])
    {
        int scores [] = new int[a.length];
        rankScores = scores;
        int testA, testB;
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++)
        {
            testA = a[i];
            if(i < a.length-1)
            {
                testB = a[i+1];
            }
            else
            {
                testB = a[i-1];
            }


            if(testA!=testB)
            {
                rankScores[i]=a[i];
            }

        }
    }*/
}
