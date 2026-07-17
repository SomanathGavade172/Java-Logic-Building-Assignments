/*
    3. Write a program which accept number from user and print odd factors of that number.
        
    Input   : 36
    Output  : 1   3   9

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display odd factors of a number.
//  Input            : Integer
//  Output           : Displays odd factors
//  Author           : Gavade Somanath Vilas
//  Date             : 12/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : DisplayFactor
//  Description      : Displays odd factors of given number on screen.
//  Input            : Integer
//  Output           : Prints odd factors
//  Date             : 12/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void DisplayFactor(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                if(iCnt % 2 != 0)
                {
                    System.out.print(iCnt + "\t");
                }
            }
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program3_03
//  Description     : This application accepts a number from user and displays odd factors of that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program3_03
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