/* 
    5. Write a program which accept number from user and return difference between summation of all its factors and non factors.
    
    Input   : 12
    Output  : -34 (16 - 50)
    
    Input   : 10
    Output  : -29 (8 - 37)

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to calculate difference between factor and non factor summation.
//  Input            : Integer
//  Output           : Returns difference between factor and non factor summation
//  Author           : Gavade Somanath Vilas
//  Date             : 14/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : FactorDifference
//  Description      : Calculates difference between summation of factors and non factors.
//  Input            : Integer
//  Output           : Integer
//  Date             : 14/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int FactorDifference(int iNo)
    {
        int iCnt = 0, iFactSum = 0, iNonFactSum = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFactSum = iFactSum + iCnt;
            }
            else
            {
                iNonFactSum = iNonFactSum + iCnt;
            }
        }

        return iFactSum - iNonFactSum;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program4_05
//  Description     : This application accepts a number from user and returns difference between factor and non factor summation.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program4_05
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.FactorDifference(iValue);

        System.out.println("Difference between Factor and Non Factor Summation is : " + iRet);
    }
}