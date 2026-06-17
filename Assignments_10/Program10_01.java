/* 
    1.Write a program which accept range from user and display all numbers in between that range.

    Input  : 23 35
    Output : 23 24 25 26 27 28 29 30 31 32 33 34 35
    
    Input  : 10 18
    Output : 10 11 12 13 14 15 16 17 18
    
    Input  : 10 10
    Output : 10
    
    Input  : -10 2
    Output : -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2
    
    Input  : 90 18
    Output : Invalid range

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Numbers
//  Description     : Contains function to display all numbers in between the given range.
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
//  Function Name   : Display
//  Description     : Displays all numbers in between the given range.
//  Input           : Integer, Integer
//  Output          : Display numbers
//  Date            : 26/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iStart, int iEnd)
    {
        int iCnt = 0;

        if(iStart > iEnd)
        {
            System.out.println("Invalid range");
            return;
        }

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }

        System.out.println();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program10_01
//  Description     : This application accepts range from user and displays all numbers in between that range.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program10_01 
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

        nobj.Display(iValue1, iValue2);
    }    
}