/* 
    5.Write a program which accept accept range from user and display all numbers in between that range in reverse order.

    Input  : 23 35
    Output : 35 34 33 32 31 30 29 28 27 26 25 24 23

    Input  : 10 18
    Output : 18 17 16 15 14 13 12 11 10

    Input  : 10 10
    Output : 10

    Input  : -10 2
    Output : 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10

    Input  : 90 18
    Output : Invalid range

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Numbers
//  Description     : Contains function to display all numbers in between the given range in reverse order.
//  Input           : Integer, Integer
//  Output          : Display numbers
//  Author          : Gavade Somanath Vilas
//  Date            : 26/05/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : RangeReverseDisplay
//  Description     : Displays all numbers in between the given range in reverse order.
//  Input           : Integer, Integer
//  Output          : Display numbers
//  Date            : 26/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void RangeReverseDisplay(int iStart, int iEnd)
    {
        int iCnt = 0;

        if(iStart > iEnd)
        {
            System.out.println("Invalid range");
            return;
        }

        for(iCnt = iEnd; iCnt >= iStart; iCnt--)
        {
            System.out.print(iCnt + "\t");
        }

        System.out.println();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program10_05
//  Description     : This application accepts range from user and displays all numbers in between that range in reverse order.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program10_05
{
    public static void main(String Arg[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Starting Point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Ending Point : ");
        iValue2 = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.RangeReverseDisplay(iValue1, iValue2);

    }    
}