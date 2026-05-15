/* 
    5. Write a program which accept N and print first 5 multiples of N.

    Input  : 4
    
    Output : 4 8 12 16 20

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Pattern
//  Description     : Contains function to display multiples of number.
//  Input            : Integer
//  Output           : Displays multiples of number
//  Author           : Gavade Somanath Vilas
//  Date             : 15/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : PrintMultiples
//  Description      : Displays first 5 multiples of given number.
//  Input            : Integer
//  Output           : Prints multiples
//  Date             : 15/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void PrintMultiples(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.print(iCnt * iNo + "\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program5_05
//  Description     : This application accepts a number from user and displays first 5 multiples of that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program5_05
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.PrintMultiples(iValue);
    }
}