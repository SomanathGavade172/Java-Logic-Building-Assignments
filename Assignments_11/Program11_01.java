/* 
        1. Write a program which accept number from user and display its digits in reverse order.

            Input : 2395
            Output : 5
                     9
                     3
                     2

            Input : -1018
            Output : 8
                     1
                     0
                     1
*/

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Digits
//  Description     : Contains function to display digits of number in reverse order.
//  Input           : Integer
//  Output          : Display digits
//  Author          : Gavade Somanath Vilas
//  Date            : 27/05/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Digits
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : DisplayReverse
//  Description     : Displays digits of number in reverse order.
//  Input           : Integer
//  Output          : Display digits
//  Date            : 27/05/2026
//  Time Complexity : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void DisplayReverse(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            System.out.println(iDigit);

            iNo = iNo / 10;
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program11_01
//  Description     : This application accepts number from user and displays its digits in reverse order.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program11_01 
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();

        dobj.DisplayReverse(iValue);

    }    
}