// NAME: Sage Yosick 
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE: 2/25/2025

public class Main
{
    public static void main(String[] args)
    {
        //DECLARATION SECTION
        int month = 0;
        int day = 0;
        int year = 0;
        int jdnDate = 0;

        //CALCULATION SECTION
        month = 8;
        day = 26;
        year = 1918;
        jdnDate = Main.calculateJulianDay(month, day, year);


        //OUTPUT SECTION
        System.out.println("The calculated Julian date for Catherine Johnson's birthday is: " + jdnDate);
        month = 06;
        day = 14;
        year = 2005;


        jdnDate = Main.calculateJulianDay(month, day, year);
        System.out.println("The calculated Julian date for my birthday is: " + jdnDate);

        month = 01;
        day = 04;
        year = 2004;

        jdnDate = Main.calculateJulianDay(month, day, year);
        System.out.println("The calculated Julian date for my boyfriend's birthday is: " + jdnDate);

    }

    //DESCRIPTION: calculate julian date given month day and year
    //PRECONDITION: valid integers for month day and year, month < 12
    //POSTCONDITION: return an integer, julian date
    public static int calculateJulianDay(int month, int day, int year){
        int a = 0;
        int m = 0;
        int y = 0;
        int jdnToday = 0;

        a = (14 - month) / 12;
        m = month + 12 * a - 3;
        y = year + 4800 - a;
        jdnToday = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

        return jdnToday;



    }
}
