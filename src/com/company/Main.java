package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sf = new Scanner(new File("scores.txt"));
        int maxIndx = -1; //-1 so when we increment below, first index is 0
        String text[] = new String[1000]; //to be safe, declare more than we need
        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( ) ;
        }

        sf.close( );

        //Used to setup our rankings


        //array of useful schools
        schools [] school = new schools[1000];
        int count = 0;//Used to count up the schools actually added
        int arrayOfScores [] = new int[school.length];

        //populate array that holds 4 useful columns
        //array is obj array passed to schools.java
        for(int j = 0; j < (text.length-1); j++) {
            String schoolName = text[j + 1];
            if (schoolName != null) {
                String[] a = schoolName.split("\t");
                //pass a[1],a[18],a[19],a[20]
                if (a.length > 18) {
                    schools toAdd = new schools(a[1], a[18], a[19], a[20]);
                    school[j] = toAdd;
                    count++;
                    arrayOfScores[j] = school[j].combinedSAT;

                    //System.out.println(toAdd.schoolName + " " + toAdd.combinedSAT + " Rank: " + toAdd.rank);
                } else {
                    schools toAdd = new schools(a[1], "0", "0", "0");
                    school[j] = toAdd;
                    count++;
                }
            }

        }

        //methods.estRankArray(arrayOfScores);
        int rankScores [] = new int[arrayOfScores.length];
        int testA, testB;
        Arrays.sort(arrayOfScores);
        for(int a = 0; a < arrayOfScores.length; a++)
        {
            testA = arrayOfScores[a];
            if(a < arrayOfScores.length-1)
            {
                testB = arrayOfScores[a+1];
            }
            else
            {
                testB = arrayOfScores[a-1];
            }


            if(testA!=testB)
            {
                rankScores[a]=arrayOfScores[a];
            }

        }
        Arrays.sort(rankScores);
        /*for(int c: rankScores)
            System.out.println(c);*/
        int countRank = 0;
        for(int q = 0; q < count; q++)
        {

            for(int w = 0; w < rankScores.length; w++)
            {
                //System.out.println(school[q].combinedSAT + " " +rankScores[w]);
                if(school[q].combinedSAT==rankScores[w])
                {
                    school[q].rank= rankScores.length-(w-countRank);
                    countRank = 0;
                }
            }
            System.out.println(school[q].schoolName + " SAT Average: " + school[q].combinedSAT);

        }


        System.out.println("____________________________________");

        methods.getRank(school, count);

        System.out.println("____________________________________");

        System.out.println("Average NY SAT: " + schools.stateAverage(arrayOfScores));
    }


    }



