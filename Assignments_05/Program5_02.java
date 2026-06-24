/* 
    2. Write a program which accept number from user and print numbers till that number.

    Input : 8

    Output : 1 2 3 4 5 6 7 8
    
*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Pattern
//  Description     : Contains function to display numbers on screen.
//  Input            : Integer
//  Output           : Displays numbers
//  Author           : Gavade Somanath Vilas
//  Date             : 15/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays numbers till given number.
//  Input            : Integer
//  Output           : Prints numbers
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
            System.out.print(iCnt + "\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program5_02
//  Description     : This application accepts a number from user and displays numbers till that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program5_02
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