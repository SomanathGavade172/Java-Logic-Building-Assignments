/* 
    3. Write a program to find factorial of given number.

    Input  : 5
    Output : 120 (5 * 4 * 3 * 2 * 1)

    Input  : -5
    Output : 120 (5 * 4 * 3 * 2 * 1)

    Input  : 4
    Output : 24 (4 * 3 * 2 * 1)

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to calculate factorial of number.
//  Input            : Integer
//  Output           : Returns factorial of number
//  Author           : Gavade Somanath Vilas
//  Date             : 16/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Calculate
//  Description      : Calculates factorial of given number.
//  Input            : Integer
//  Output           : Integer
//  Date             : 16/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int Calculate(int iNo)
    {
        int iCnt = 0, iFact = 1;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program6_03
//  Description     : This application accepts number from user and calculates factorial of that number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program6_03
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Calculate(iValue);

        System.out.println("Factorial is : " + iRet);
    }
}