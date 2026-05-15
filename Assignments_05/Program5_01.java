/*
    1. Write a program which accept number from user and print that number of ($ & *) on screen.

    Input   : 5
    Output  : $ * $ * $ * $ * $ *

    Input   : 3
    Output  : $ * $ *

    Input   : -3
    Output  : $ * $ * $ *

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Pattern
//  Description     : Contains function to display pattern on screen.
//  Input            : Integer
//  Output           : Displays pattern
//  Author           : Gavade Somanath Vilas
//  Date             : 15/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays pattern of $ and * on screen.
//  Input            : Integer
//  Output           : Prints pattern
//  Date             : 15/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("$\t*\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program5_01
//  Description     : This application accepts a number from user and displays pattern on screen.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program5_01
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);
    }
}