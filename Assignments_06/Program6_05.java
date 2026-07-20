/* 
    5. Write a program which accept number from user and display its table in reverse order.

    Input  : 2
    Output : 20 18 16 14 12 10  8  6  4 2

    Input  : 5
    Output : 50 45 40 35 30 25 20 15 10 5

    Input  : -5
    Output : 50 45 40 35 30 25 20 15 10 5

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display table of number in reverse order.
//  Input            : Integer
//  Output           : Displays reverse table of number
//  Author           : Gavade Somanath Vilas
//  Date             : 16/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : DisplayReverseTable
//  Description      : Displays reverse table of given number.
//  Input            : Integer
//  Output           : Prints multiplication table in reverse order
//  Date             : 16/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void DisplayReverseTable(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 10; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt * iNo + "\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program6_05
//  Description     : This application accepts number from user and displays reverse table of that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program6_05
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayReverseTable(iValue);
    }
}