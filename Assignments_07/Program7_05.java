/*
    5. Write a program which returns difference between Even factorial and odd factorial of given number.
    
    Input  : 5    
    Output : -7 (8 - 15)
    
    Input  : -5
    Output : -7 (8 - 15)
    
    Input  : 10
    Output : 2895 (3840 - 945)

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name        : Factorial
//  Description       : Contains function to calculate difference between even and odd factorial.
//  Input              : Integer
//  Output             : Returns difference between even and odd factorial
//  Author             : Gavade Somanath Vilas
//  Date               : 17/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Factorial
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name     : FactDiff
//  Description       : Calculates difference between even factorial and odd factorial.
//  Input              : Integer
//  Output             : Returns difference between even factorial and odd factorial
//  Date               : 17/05/2026
//  Time Complexity    : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int FactDiff(int iNo)
    {
        int iCnt = 0;
        int iEvenFact = 1, iOddFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iEvenFact = iEvenFact * iCnt;
            }
            else
            {
                iOddFact = iOddFact * iCnt;
            }
        }

        return iEvenFact - iOddFact;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name       : Program7_05
//  Description      : This application accepts number from user and calculates difference between even and odd factorial.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program7_05
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Factorial fobj = new Factorial();

        iRet = fobj.FactDiff(iValue);

        System.out.println("Difference between Even and Odd Factorial is : " + iRet);

    }
}