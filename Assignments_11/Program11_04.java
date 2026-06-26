/* 
    4.Write a program which accept number from user and count frequency of 4 in it.

    Input  : 2395
    Output : 0

    Input  : 1018
    Output : 0

    Input  : 9440
    Output : 2

    Input  : 922432
    Output : 1

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to count frequency of 4 in the given number.
//  Input           : Integer
//  Output          : Integer
//  Author          : Gavade Somanath Vilas
//  Date            : 27/05/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Digits
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : CountFour
//  Description     : Counts frequency of 4 in the given number.
//  Input           : Integer
//  Output          : Integer
//  Date            : 27/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int CountFour(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 4)
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
//  Class Name      : Program11_04
//  Description     : This application accepts number from user and counts frequency of 4 in it.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program11_04
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.CountFour(iValue);

        System.out.println("Frequency of 4 is : " + iRet);

    }    
}