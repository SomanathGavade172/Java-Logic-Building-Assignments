/*
    1. Write a program which accept number from user and if number is less than or equal to 50 then print Small,
       if it is greater than 50 and less than or equal to 100 then print Medium,
       if it is greater than 100 then print Large.

    Input  : 75

    Output : Medium
*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to check range of number.
//  Input            : Integer
//  Output           : Displays size category of number
//  Author           : Gavade Somanath Vilas
//  Date             : 16/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : Display
//  Description      : Displays whether number is Small, Medium or Large.
//  Input            : Integer
//  Output           : Prints category
//  Date             : 16/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iNo)
    {
        if(iNo <= 50)
        {
            System.out.println("Small");
        }
        else if((iNo > 50) && (iNo <= 100))
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Large");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program6_01
//  Description     : This application accepts number from user and displays its category.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program6_01
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