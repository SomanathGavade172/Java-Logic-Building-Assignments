/*
    2. Write a program which accept number from user and print even factors of that number.
    
    Input   : 24
    Output  : 2 4 6 8 12

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display even factors of a number.
//  Input            : Integer
//  Output           : Displays even factors
//  Author           : Gavade Somanath Vilas
//  Date             : 12/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : DisplayFactor
//  Description      : Displays even factors of given number on screen.
//  Input            : Integer
//  Output           : Prints even factors
//  Date             : 12/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void DisplayFactor(int iNo)
    {
        int iCnt = 0;

        if(iNo % 2 != 0)
        {
            return;
        }

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                if(iCnt % 2 == 0)
                {
                    System.out.print(iCnt + "\t");
                }
            }
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program3_02
//  Description     : This application accepts a number from user and displays even factors of that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program3_02
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayFactor(iValue);
    }
}