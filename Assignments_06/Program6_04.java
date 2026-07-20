/* 
    4.Write a program which accept number from user and display its table.

    Input   : 2
    Output  : 2 4 6 8 10 12 14 16 18 20

    Input   : 5
    Output  : 5 10 15 20 25 30 35 40 45 50

    Input   :-5
    Output  : 5 10 15 20 25 30 35 40 45 50

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display table of number.
//  Input            : Integer
//  Output           : Displays table of number
//  Author           : Gavade Somanath Vilas
//  Date             : 16/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : DisplayTable
//  Description      : Displays table of given number.
//  Input            : Integer
//  Output           : Prints multiplication table
//  Date             : 16/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void DisplayTable(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.print(iCnt * iNo + "\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program6_04
//  Description     : This application accepts number from user and displays table of that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program6_04
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayTable(iValue);
    }
}