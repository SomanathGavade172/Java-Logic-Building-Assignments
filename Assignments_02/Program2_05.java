// 5. Accept number from user and check whether number is even or odd.

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to check whether number is even or odd.
//  Input            : Integer
//  Output           : Returns true if number is even otherwise false
//  Author           : Gavade Somanath Vilas
//  Date             : 11/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : CheckEvenOdd
//  Description      : Checks whether given number is even or odd.
//  Input            : Integer
//  Output           : Boolean
//  Date             : 11/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean CheckEvenOdd(int iNo)
    {
        if(iNo % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program2_05
//  Description     : This application accepts a number from user and checks whether it is even or odd.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program2_05
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}