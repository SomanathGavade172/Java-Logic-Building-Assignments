// 1. Program to divide two numbers

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Divide
//  Description     : Contains function to divide two numbers.
//  Input            : Integer, Integer
//  Output           : Returns division of two numbers
//  Author           : Gavade Somanath Vilas
//  Date             : 11/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Divide
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : DivideX
//  Description      : Divides two numbers and returns the result.
//  Input            : Integer, Integer
//  Output           : Integer
//  Date             : 11/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int DivideX(int iNo1, int iNo2)
    {
        int iResult = 0;

        if(iNo2 == 0)
        {
            return -1;
        }

        iResult = iNo1 / iNo2;

        return iResult;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program1_01
//  Description     : This application accepts two numbers from user and performs division.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program1_01
{
    public static void main(String Arg[])
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Divide dobj = new Divide();

        iRet = dobj.DivideX(iValue1, iValue2);

        System.out.println("Division is : " + iRet);
    }
}