/*  
    2. Write a program which accepts width and height of rectangle from user and calculates its area.
       (Area = Width * Height)

    Input  : 5.3 9.78
    Output : 51.834

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Rectangle
//  Description     : Contains function to calculate area of rectangle.
//  Input           : Float
//  Output          : Double
//  Author          : Gavade Somanath Vilas
//  Date            : 22/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Rectangle
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : RectangleArea
//  Description     : Calculates area of rectangle using formula Width * Height.
//  Input           : Float, Float
//  Output          : Double
//  Date            : 22/05/2026
//  Time Complexity : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double RectangleArea(float fWidth, float fHeight)
    {
        double dArea = 0.0;

        dArea = fWidth * fHeight;

        return dArea;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program8_02
//  Description     : This application accepts width and height from user and 
//                    calculates area of rectangle.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program8_02
{
    public static void main(String Arg[])
    {
        float fValue1 = 0.0f, fValue2 = 0.0f;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter width of Rectangle : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter height of Rectangle : ");
        fValue2 = sobj.nextFloat();

        Rectangle robj = new Rectangle();

        dRet = robj.RectangleArea(fValue1, fValue2);

        System.out.println("Area of Rectangle is : " + dRet);
    }
}