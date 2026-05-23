/* 
    4. Write a program which accepts temperature in Fahrenheit and converts it into Celsius.
       (Celsius = (Temperature - 32) * (5/9))

    Input  : 10
    Output : -12.2222

    Input  : 34
    Output : 1.11111

*/ 

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Temperature
//  Description     : Contains function to convert Fahrenheit into Celsius.
//  Input           : Float
//  Output          : Double
//  Author          : Gavade Somanath Vilas
//  Date            : 23/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Temperature
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : FahrenheitToCelsius
//  Description     : Converts temperature from Fahrenheit into Celsius.
//  Input           : Float
//  Output          : Double
//  Date            : 23/05/2026
//  Time Complexity : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double FahrenheitToCelsius(float fTemp)
    {
        double dCelsius = 0.0;

        dCelsius = (fTemp - 32) * (5.0 / 9.0);

        return dCelsius;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program9_04
//  Description     : This application accepts temperature in Fahrenheit from 
//                    user and converts it into Celsius.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program9_04
{
    public static void main(String Arg[])
    {
        float fValue = 0.0f;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit : ");
        fValue = sobj.nextFloat();

        Temperature tobj = new Temperature();

        dRet = tobj.FahrenheitToCelsius(fValue);

        System.out.println(fValue + " Fahrenheit = " + dRet + " Celsius");
    }
}