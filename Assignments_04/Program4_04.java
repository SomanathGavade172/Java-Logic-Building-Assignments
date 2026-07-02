/* 
    4. Write a program which accept number from user and return summation of all its non factors.
    
    Input   : 12
    Output  : 50
    
    Input   : 10
    Output  : 37

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Number
//  Description     : Contains function to calculate summation of non factors.
//  Input            : Integer
//  Output           : Returns summation of non factors
//  Author           : Gavade Somanath Vilas
//  Date             : 14/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Number
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : NonFactorSummation
//  Description      : Calculates summation of non factors of given number.
//  Input            : Integer
//  Output           : Integer
//  Date             : 14/05/2026
//  Time Complexity  : O(N)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int NonFactorSummation(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -(iNo);
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program4_04
//  Description     : This application accepts a number from user and returns summation of its non factors.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program4_04
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.NonFactorSummation(iValue);

        System.out.println("Summation of Non Factors is : " + iRet);
    }
}