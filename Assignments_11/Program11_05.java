/* 
    5.Write a program which accept number from user and count frequency of such a digits which are less than 6.

    Input  : 2395
    Output : 3

    Input  : 1018
    Output : 3

    Input  : 9440
    Output : 3

    Input  : 96672
    Output : 1

*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to count digits which are less than 6.
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
//  Function Name   : CountLessSix
//  Description     : Counts digits which are less than 6.
//  Input           : Integer
//  Output          : Integer
//  Date            : 27/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int CountLessSix(int iNo)
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

            if(iDigit < 6)
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
//  Class Name      : Program11_05
//  Description     : This application accepts number from user and counts digits which are less than 6.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program11_05
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.CountLessSix(iValue);

        System.out.println("Frequency of digits less than 6 is : " + iRet);

    }    
}