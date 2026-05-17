/*
    3.Write a program to find even factorial of given number.

    Input  : 5
    Output : 8 (4 * 2)

    Input  : -5
    Output : 8 (4 * 2)

    Input  : 10
    Output : 3840 (10 * 8 * 6 * 4 * 2)

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name       : Factorial
//  Description      : Contains function to calculate even factorial.
//  Input             : Integer
//  Output            : Returns even factorial
//  Author            : Gavade Somanath Vilas
//  Date              : 17/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Factorial
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : EvenFact
//  Description      : Calculates even factorial of given number.
//  Input             : Integer
//  Output            : Returns even factorial
//  Date              : 17/05/2026
//  Time Complexity   : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int EvenFact(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iFact = iFact * iCnt;
            }
        }

        return iFact;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name       : Program7_03
//  Description      : This application accepts number from user and calculates even factorial.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program7_03
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Factorial fobj = new Factorial();

        iRet = fobj.EvenFact(iValue);

        System.out.println("Even Factorial is : " + iRet);

    }
}