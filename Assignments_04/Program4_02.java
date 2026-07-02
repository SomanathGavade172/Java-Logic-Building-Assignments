/* 
    2. Write a program which accept number from user and display its factors in decreasing order.

    Input    : 12
    Output   : 6 4 3 2 1

    Input    : 13
    Output   : 1

    Input    : 10
    Output   : 5 2 1

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display factors in decreasing order.
//  Input            : Integer
//  Output           : Displays factors in decreasing order
//  Author           : Gavade Somanath Vilas
//  Date             : 14/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : FactorReverseDisplay
//  Description      : Displays factors of given number in decreasing order.
//  Input            : Integer
//  Output           : Prints factors in decreasing order
//  Date             : 14/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void FactorReverseDisplay(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = iNo / 2; iCnt >= 1; iCnt--)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program4_02
//  Description     : This application accepts a number from user and displays its factors in decreasing order.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program4_02
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.FactorReverseDisplay(iValue);
    }
}