/* 
    2. Write a program which accept range from user and display all even numbers in between that range.

    Input  : 23 35
    Output : 24 26 28 30 32 34

    Input  : 10 18
    Output : 10 12 14 16 18

    Input  : 10 10
    Output : 10

    Input  : -10 2
    Output : -10 -8 -6 -4 -2 0 2

    Input  : 90 18
    Output : Invalid range

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Numbers
//  Description     : Contains function to display all even numbers in between the given range.
//  Input           : Integer, Integer
//  Output          : Display even numbers
//  Author          : Gavade Somanath Vilas
//  Date            : 26/05/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : DisplayEven
//  Description     : Displays all even numbers in between the given range.
//  Input           : Integer, Integer
//  Output          : Display even numbers
//  Date            : 26/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void DisplayEven(int iStart, int iEnd)
    {
        int iCnt = 0;

        if(iStart > iEnd)
        {
            System.out.println("Invalid range");
            return;
        }

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt + "\t");
            }            
        }

        System.out.println();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program10_02
//  Description     : This application accepts range from user and displays all even numbers in between that range.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program10_02
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

        nobj.DisplayEven(iValue1, iValue2);
    }    
}