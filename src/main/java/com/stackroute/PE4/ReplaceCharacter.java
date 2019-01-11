/**
 * a program to replace all d with f and all l with t in the given String
 * Input: daily dry
 * Output: faity fry
 * Original string: daily dry
 * New String: faity fry
 */
package com.stackroute.PE4;

public class ReplaceCharacter {

    /*
    This method will replace the character original characters.
     */
    public String replaceCharcterMethod(char original1,char replace1 , char original2 , char replace2 ,String originalString)
    {
        //Original String is null or not
        if(originalString != null )
        {
            String replaceString="";
            replaceString=originalString.replace(original1,replace1);
            replaceString=replaceString.replace(original2,replace2);
            return replaceString;
        }
        return null;
    }
}
