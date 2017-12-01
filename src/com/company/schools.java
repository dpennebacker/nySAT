package com.company;

public class schools
{
    public String schoolName;
    public int SATmath;
    public int SATreading;
    public int SATwriting;
    public int combinedSAT;
    public int rank;



    public schools(String n, String m, String r, String w) {
        schoolName = n;
        combinedSAT = 0;

        if((!n.equals(""))&&(!m.equals(""))&&(!r.equals(""))&&(!w.equals("")))
        {
            SATmath = Integer.parseInt(m);
            SATreading = Integer.parseInt(r);
            SATwriting = Integer.parseInt(w);

            combinedSAT = getSAT();

        }
        //System.out.println("combined" + combinedSAT);
    }

    public int getSAT(){


        return combinedSAT = SATmath + SATreading + SATwriting;
}



    public static double stateAverage(int [] a)
    {
        double avg;
        double sum = 0;
        double numSchoolsReporting = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]>1)
            {
                numSchoolsReporting++;

            }
            sum = sum + a[i];
        }
        return avg = sum/(numSchoolsReporting);
    }



}
