/* 
    1. Write a program which accept number from user and display multiplication of factors.

    Input   : 12
    Output  : 144 (1 * 2 * 3 * 4 * 6)

    Input   : 13
    Output  : 1 (1)

    Input   : 10
    Output  : 10 (1 * 2 * 5)

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to calculate multiplication of factors.
//  Input            : Integer
//  Output           : Returns multiplication of factors
//  Author           : Gavade Somanath Vilas
//  Date             : 14/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : MultFact
//  Description      : Calculates multiplication of factors of given number.
//  Input            : Integer
//  Output           : Integer
//  Date             : 14/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int MultFact(int iNo)
    {
        int iCnt = 0, iMult = 1;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iMult = iMult * iCnt;
            }
        }

        return iMult;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program4_01
//  Description     : This application accepts a number from user and displays multiplication of its factors.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program4_01
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.MultFact(iValue);
        
        System.out.println("Multiplication of factors is : " + iRet);
    }
}