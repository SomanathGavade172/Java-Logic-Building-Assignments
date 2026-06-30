/*
    5. Accept one character from user and check whether that character is vowel(a, e, i, o, u) or not.

    Input : E        Output : TRUE
    Input : d        Output : FALSE

*/

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Character
//  Description     : Contains function to check whether character is vowel or not.
//  Input            : Character
//  Output           : Returns true if character is vowel otherwise false
//  Author           : Gavade Somanath Vilas
//  Date             : 12/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Character
{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name    : ChkVowel
//  Description      : Checks whether given character is vowel or not.
//  Input            : Character
//  Output           : Boolean
//  Date             : 12/05/2026
//  Time Complexity  : O(1)
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean ChkVowel(char Ch)
    {
        if(Ch == 'A' || Ch == 'E' || Ch == 'I' || Ch == 'O' || Ch == 'U' || Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u')
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
//  Class Name      : Program3_05
//  Description     : This application accepts a character from user and checks whether it is vowel or not.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program3_05
{
    public static void main(String Arg[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        cValue = sobj.next().charAt(0);

        Character cobj = new Character();

        bRet = cobj.ChkVowel(cValue);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}