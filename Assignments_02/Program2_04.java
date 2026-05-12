/*
    4. Accept two numbers from user and display first number second number of times.

    Input  : 12    5
    Output : 12    12    12    12    12

    Input  : -2    3
    Output : -2    -2    -2

    Input  : -2    0
    Output :

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display first number second number of times.
//  Input            : Integer, Integer
//  Output           : Displays number pattern
//  Author           : Gavade Somanath Vilas
//  Date             : 11/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays first number second number of times.
//  Input            : Integer, Integer
//  Output           : Prints number pattern
//  Date             : 11/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iNo1, int iNo2)
    {
        int iCnt = 0;

        if(iNo1 < 0)
        {
            iNo1 = -(iNo1);
        }

        for(iCnt = 1; iCnt <= iNo2; iCnt++)
        {
            System.out.print(iNo1 + "\t");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program2_04
//  Description     : This application accepts two numbers from user and displays first number second number of times.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program2_04
{
    public static void main(String Arg[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Number nobj = new Number();

        nobj.Display(iValue1, iValue2);
    }
}