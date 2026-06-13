/*  
    5.Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.

    Input  : 2395
    Output : -15    (2 - 17)

    Input  : 1018
    Output : 6      (8 - 2)

    Input  : 8440
    Output : 16     (16 - 0)

    Input  : 5733
    Output : -18    (0 - 18)

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to return difference between summation of even digits and summation of odd digits.
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
//  Function Name   : DiffEvenOddSum
//  Description     : Returns difference between summation of even digits and summation of odd digits.
//  Input           : Integer
//  Output          : Integer
//  Date            : 31/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int DiffEvenOddSum(int iNo)
    {
        int iDigit = 0;
        int iSumEven = 0, iSumOdd = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0)
        {
            return 0;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            iNo = iNo / 10;
        }

        return iSumEven - iSumOdd;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program12_05
//  Description     : This application accepts number from user and returns difference between summation of even digits and summation of odd digits.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program12_05
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.DiffEvenOddSum(iValue);

        System.out.println("Difference between summation of even digits and odd digits is : " + iRet);
    }
}