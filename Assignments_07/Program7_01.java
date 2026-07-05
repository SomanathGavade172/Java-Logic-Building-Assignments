/* 
    1.Write a program which accept number from user and display below pattern.

    Input  : 5
    Output : * * * * * # # # # #

    Input  : 6
    Output : * * * * * * # # # # # #

    Input  :-5
    Output : * * * * * # # # # #

    Input  : 2
    Output : * * # #
*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Pattern
//  Description     : Contains function to display pattern.
//  Input            : Integer
//  Output           : Displays pattern
//  Author           : Gavade Somanath Vilas
//  Date             : 17/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays pattern of * and #.
//  Input            : Integer
//  Output           : Prints pattern
//  Date             : 17/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t");
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program7_01
//  Description     : This application accepts number from user and displays pattern.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program7_01
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