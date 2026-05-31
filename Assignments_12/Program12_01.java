/* 
    1.Write a program which accept number from user and return the count of even digits.

        Input  : 2395
        Output : 1

        Input  : 1018
        Output : 2

        Input  : -1018
        Output : 2

        Input  : 8462
        Output : 4

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to count even digits in the given number.
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
//  Function Name   : CountEven
//  Description     : Counts even digits in the given number.
//  Input           : Integer
//  Output          : Integer
//  Date            : 31/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int CountEven(int iNo)
    {
        int iCount = 0, iDigit = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        if(iNo == 0)
        {
            return 1;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
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
//  Class Name      : Program12_01
//  Description     : This application accepts number from user and counts even digits in it.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program12_01
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.CountEven(iValue);

        System.out.println("Frequency of Even Digits is : " + iRet);

    }
}