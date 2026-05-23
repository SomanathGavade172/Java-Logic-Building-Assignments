/* 
    3. Write a program which accepts distance in kilometre and converts it into meter.
       (1 Kilometre = 1000 Meter)

    Input  : 5
    Output : 5000

    Input  : 12
    Output : 12000

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Distance
//  Description     : Contains function to convert kilometre into meter.
//  Input           : Integer
//  Output          : Integer
//  Author          : Gavade Somanath Vilas
//  Date            : 23/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Distance
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : KmToMeter
//  Description     : Converts distance from kilometre into meter.
//  Input           : Integer
//  Output          : Integer
//  Date            : 23/05/2026
//  Time Complexity : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int KmToMeter(int iDistance)
    {
        int iConvert = 0;

        iConvert = iDistance * 1000;

        return iConvert;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program9_03
//  Description     : This application accepts distance in kilometre from user
//                    and converts it into meter.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program9_03
{
    public static void main(String Arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter distance in kilometre : ");
        iValue = sobj.nextInt();

        Distance dobj = new Distance();

        iRet = dobj.KmToMeter(iValue);

        System.out.println(iValue + " Kilometre = " + iRet + " Meter");
    }
}