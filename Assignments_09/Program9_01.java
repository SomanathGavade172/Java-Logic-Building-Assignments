/* 
    1. Write a program which accepts radius of a circle from user and calculates its area. Consider value of PI as 3.14.
       (Area = PI * Radius * Radius)

    Input  : 5.3
    Output : 88.2026

    Input  : 10.4
    Output : 339.6224
*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Circle
//  Description     : Contains function to calculate area of a circle.
//  Input           : Float
//  Output          : Double
//  Author          : Gavade Somanath Vilas
//  Date            : 23/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Circle
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : CircleArea
//  Description     : Calculates area of a circle using formula PI * Radius * Radius.
//  Input           : Float
//  Output          : Double
//  Date            : 23/05/2026
//  Time Complexity : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double CircleArea(float fRadius)
    {
        double dResult = 0.0;
        float PI = 3.14f;

        dResult = PI * fRadius * fRadius;

        return dResult;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program9_01
//  Description     : This application accepts radius from user and calculates area of circle.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program9_01
{
    public static void main(String Arg[])
    {
        float fValue = 0.0f;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter radius of a circle : ");
        fValue = sobj.nextFloat();

        Circle cobj = new Circle();

        dRet = cobj.CircleArea(fValue);

        System.out.println("Area of circle is : " + dRet);
    }
}