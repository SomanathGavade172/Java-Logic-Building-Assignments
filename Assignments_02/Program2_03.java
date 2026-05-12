// 3. Accept one number from user if number is less than 10 then print "Hello" otherwise print "Demo".

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to display message based on given number.
//  Input            : Integer
//  Output           : Displays "Hello" or "Demo"
//  Author           : Gavade Somanath Vilas
//  Date             : 11/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays "Hello" if number is less than 10 otherwise displays "Demo".
//  Input            : Integer
//  Output           : Prints message on screen
//  Date             : 11/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        if(iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program2_03
//  Description     : This application accepts a number from user and displays message based on number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program2_03
{
    public static void main(String Arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.Display(iValue);
    }
}