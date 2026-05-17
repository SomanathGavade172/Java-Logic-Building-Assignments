/*
    2. Accept amount in US dollar and return its corresponding value in Indian currency.

        //  Consider 1$ as 70 rupees.

    Input  : 10
    Output : 700

    Input  : 3
    Output : 210

    Input  : 1200
    Output : 84000

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name       : Currency
//  Description      : Contains function to convert USD into INR.
//  Input             : Integer
//  Output            : Returns converted currency
//  Author            : Gavade Somanath Vilas
//  Date              : 17/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Currency
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Convert
//  Description      : Converts USD into Indian Rupees.
//  Input             : Integer
//  Output            : Returns converted amount
//  Date              : 17/05/2026
//  Time Complexity   : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int Convert(int iNo)
    {
        int iConvert = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iConvert = iNo * 70;

        return iConvert;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name       : Program7_02
//  Description      : This application accepts amount in USD and converts it into INR.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program7_02
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Amount in USD : ");
        iValue = sobj.nextInt();

        Currency cobj = new Currency();

        iRet = cobj.Convert(iValue);

        System.out.println("Indian Currency is : " + iRet);

    }
}