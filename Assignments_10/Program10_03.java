/* 
    3. Write a program which accept range from user and return addition of all numbers in between that range. (Range should contains positive numbers only).

    Input  : 23 30
    Output : 212

    Input  : 10 18
    Output : 126

    Input  : -10 2
    Output : Invalid range

    Input  : 90 18
    Output : Invalid range

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Numbers
//  Description     : Contains function to return addition of all numbers in between the given range.
//  Input           : Integer, Integer
//  Output          : Integer
//  Author          : Gavade Somanath Vilas
//  Date            : 26/05/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : RangeSum
//  Description     : Returns addition of all numbers in between the given range.
//  Input           : Integer, Integer
//  Output          : Integer
//  Date            : 26/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int RangeSum(int iStart, int iEnd)
    {
        int iCnt = 0, iSum = 0;

        if(iStart > iEnd || iStart < 0 || iEnd < 0)
        {
            System.out.println("Invalid range");
            return -1;
        }

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            iSum = iSum + iCnt;           
        }

        return iSum;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program10_03
//  Description     : This application accepts range from user and returns addition of all numbers in between that range.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program10_03
{
    public static void main(String Arg[])
    {
        int iValue1 = 0, iValue2 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Starting Point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Ending Point : ");
        iValue2 = sobj.nextInt();

        Numbers nobj = new Numbers();

        iRet = nobj.RangeSum(iValue1, iValue2);

        if(iRet != -1)
        {
            System.out.println("Summation of all the numbers are : " + iRet);
        }

    }    
}