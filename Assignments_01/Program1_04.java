// 4. Accept one number and check whether it is divisible by 5 or not.

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to check divisibility by 5.
//  Input            : Integer
//  Output           : Returns true if number is divisible by 5 otherwise false
//  Author           : Gavade Somanath Vilas
//  Date             : 11/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : CheckDivision
//  Description      : Checks whether given number is divisible by 5 or not.
//  Input            : Integer
//  Output           : Boolean
//  Date             : 11/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean CheckDivision(int iNo)
    {
        if(iNo % 5 == 0)
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
//  Class Name      : Program1_04
//  Description     : This application accepts a number and checks whether it is divisible by 5 or not.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program1_04
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckDivision(iValue);

        if(bRet == true)
        {
            System.out.println("It is divisible by 5");
        }
        else
        {
            System.out.println("It is not divisible by 5");
        }
    }
}