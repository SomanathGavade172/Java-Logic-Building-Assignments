/* 
    2.Write a program which accept number from user and check whether it contains 0 in it or not.

    Input  : 2395
    Output : There is no Zero

    Input  : 1018
    Output : It Contains Zero

    Input  : 9000
    Output : It Contains Zero

    Input  : 10687
    Output : It Contains Zero

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to check whether number contains zero or not.
//  Input           : Integer
//  Output          : Boolean
//  Author          : Gavade Somanath Vilas
//  Date            : 27/05/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Digits
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : ChkZero
//  Description     : Checks whether number contains zero or not.
//  Input           : Integer
//  Output          : Boolean
//  Date            : 27/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean ChkZero(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                return true;
            }

            iNo = iNo / 10;
        }

        return false;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program11_02
//  Description     : This application accepts number from user and checks whether it contains zero or not.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program11_02
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        bRet = dobj.ChkZero(iValue);

        if(bRet == true)
        {
            System.out.println("It Contains Zero");
        }
        else
        {
            System.out.println("There is no Zero");
        }

    }    
}