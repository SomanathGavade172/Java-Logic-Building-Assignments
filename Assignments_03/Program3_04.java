/*
    4. Accept one character from user and convert case of that character.
    
    Input : a       Output : A

    Input : D       Output : d

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Character
//  Description     : Contains function to convert case of character.
//  Input            : Character
//  Output           : Displays converted character
//  Author           : Gavade Somanath Vilas
//  Date             : 12/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Character
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : DisplayConvert
//  Description      : Converts case of given character.
//  Input            : Character
//  Output           : Prints converted character
//  Date             : 12/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void DisplayConvert(char Ch)
    {
        if(Ch >= 'A' && Ch <= 'Z')
        {
            Ch = (char)(Ch + 32);

            System.out.println(Ch);
        }
        else if(Ch >= 'a' && Ch <= 'z')
        {
            Ch = (char)(Ch - 32);

            System.out.println(Ch);
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Program3_04
//  Description     : This application accepts a character from user and converts its case.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program3_04
{
    public static void main(String Arg[])
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        cValue = sobj.next().charAt(0);

        Character cobj = new Character();

        cobj.DisplayConvert(cValue);
    }
}