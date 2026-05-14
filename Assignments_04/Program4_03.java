/* 
    3. Write a program which accept number from user and display all its non factors.

    Input   : 12
    Output  : 5 7 8 9 10 11

    Input   : 13
    Output  : 2 3 4 5 6 7 8 9 10 11 12

    Input   : 10
    Output  : 3 4 6 7 8 9

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display non factors of a number.
//  Input            : Integer
//  Output           : Displays non factors
//  Author           : Gavade Somanath Vilas
//  Date             : 14/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : FactorNonDisplay
//  Description      : Displays non factors of given number.
//  Input            : Integer
//  Output           : Prints non factors
//  Date             : 14/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void FactorNonDisplay(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program4_03
//  Description     : This application accepts a number from user and displays its non factors.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program4_03
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.FactorNonDisplay(iValue);
    }
}