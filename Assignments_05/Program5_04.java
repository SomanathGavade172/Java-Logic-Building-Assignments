/* 
    4. Write a program which accepts N from user and print all odd numbers up to N.

    Input  : 18

    Output : 1 3 5 7 9 11 13 15 17

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Pattern
//  Description     : Contains function to display odd numbers on screen.
//  Input            : Integer
//  Output           : Displays odd numbers
//  Author           : Gavade Somanath Vilas
//  Date             : 15/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays all odd numbers up to given number.
//  Input            : Integer
//  Output           : Prints odd numbers
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
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt + "\t");
            }
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program5_04
//  Description     : This application accepts a number from user and displays odd numbers up to that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program5_04
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