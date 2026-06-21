/*  
    5. Write a program which accepts area in square feet and converts it into square meter.
       (1 Square Feet = 0.0929 Square Meter)

    Input  : 5
    Output : 0.4645

    Input  : 7
    Output : 0.6503

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Area
//  Description     : Contains function to convert square feet into square meter.
//  Input           : Float
//  Output          : Double
//  Author          : Gavade Somanath Vilas
//  Date            : 22/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Area
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : SquareMeter
//  Description     : Converts area from square feet into square meter.
//  Input           : Float
//  Output          : Double
//  Date            : 22/05/2026
//  Time Complexity : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double SquareMeter(float fArea)
    {
        double dConvert = 0.0;

        dConvert = fArea * 0.0929;

        return dConvert;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program8_05
//  Description     : This application accepts area in square feet from user and converts it into square meter.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program8_05
{
    public static void main(String Arg[])
    {
        float fValue = 0.0f;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter area in Square Feet : ");
        fValue = sobj.nextFloat();

        Area aobj = new Area();

        dRet = aobj.SquareMeter(fValue);

        System.out.println(fValue + " Square Feet = " + dRet + " Square Meter");
    }
}