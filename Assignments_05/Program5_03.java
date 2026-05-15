/*
    3. Write a program which accept number from user and print its number line.
    
    Input : 4

    Output : -4 -3 -2 -1 0 1 2 3 4

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Pattern
//  Description     : Contains function to display number line on screen.
//  Input            : Integer
//  Output           : Displays number line
//  Author           : Gavade Somanath Vilas
//  Date             : 15/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays number line from negative to positive value.
//  Input            : Integer
//  Output           : Prints number line
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

        for(iCnt = -(iNo); iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program5_03
//  Description     : This application accepts a number from user and displays number line.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program5_03
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