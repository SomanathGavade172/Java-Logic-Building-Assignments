/*
    4. Write a program to find odd factorial of given number.

    Input  : 5
    Output : 15 (5 * 3 * 1)

    Input  : -5
    Output : 15 (5 * 3 * 1)

    Input  : 10
    Output : 945 (9 * 7 * 5 * 3 * 1)

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name        : Factorial
//  Description       : Contains function to calculate odd factorial.
//  Input              : Integer
//  Output             : Returns odd factorial
//  Author             : Gavade Somanath Vilas
//  Date               : 17/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Factorial
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name     : OddFact
//  Description       : Calculates odd factorial of given number.
//  Input              : Integer
//  Output             : Returns odd factorial
//  Date               : 17/05/2026
//  Time Complexity    : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int OddFact(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                iFact = iFact * iCnt;
            }
        }

        return iFact;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name       : Program7_04
//  Description      : This application accepts number from user and calculates odd factorial.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program7_04
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Factorial fobj = new Factorial();

        iRet = fobj.OddFact(iValue);

        System.out.println("Odd Factorial is : " + iRet);

    }
}