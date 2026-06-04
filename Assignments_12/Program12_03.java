/* 
    3.Write a program which accept number from user and return the count of digits in between 3 and 7.

    Input   : 2395
    Output  : 1

    Input   : 1018
    Output  : 0

    Input   : 4521
    Output  : 2
    
    Input   : 9922
    Output  : 0

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to count digits in between 3 and 7.
//  Input           : Integer
//  Output          : Integer
//  Author          : Gavade Somanath Vilas
//  Date            : 31/05/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Digits
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : CountBetween3And7
//  Description     : Counts digits in between 3 and 7.
//  Input           : Integer
//  Output          : Integer
//  Date            : 31/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int CountBetween3And7(int iNo)
    {
        int iCount = 0, iDigit = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        if(iNo == 0)
        {
            return 0;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit > 3) && (iDigit < 7))
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program12_03
//  Description     : This application accepts number from user and counts digits in between 3 and 7.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program12_03
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.CountBetween3And7(iValue);

        System.out.println("Frequency of digits between 3 and 7 is : " + iRet);

    }
}