/* 
    4.Write a program which accept number from user and return multiplication of all digits. 

    Input  : 2395
    Output : 270

    Input  : 1018
    Output : 8

    Input  : 9440
    Output : 144

    Input  : 922432
    Output : 864

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to return multiplication of all digits.
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
//  Function Name   : MultiplyDigits
//  Description     : Returns multiplication of all digits.
//  Input           : Integer
//  Output          : Integer
//  Date            : 31/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int MultiplyDigits(int iNo)
    {
        int iMulti = 1, iDigit = 0;

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

            if(iDigit != 0)
            {
                iMulti = iMulti * iDigit;
            }

            iNo = iNo / 10;
        }

        return iMulti;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program12_04
//  Description     : This application accepts number from user and returns multiplication of all digits.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program12_04
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.MultiplyDigits(iValue);

        System.out.println("Multiplication of all digits is : " + iRet);

    }
}