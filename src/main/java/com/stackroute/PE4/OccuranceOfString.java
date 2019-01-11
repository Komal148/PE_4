/**
 *  a program to find out the multiple occurrences of the given word in a s
 *  tring using Matcher methods.
 *  Input : She sells seashells by the seashore
 *  Given word: se
 *  Output :
 *         Found at: 4 - 6
 *         Found at: 10 - 12
 *        Found at: 27 - 29
 */
package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceOfString {
    /*
    This method will find the position of occurance of checkString in the original String.
     */
    public String findOcuuranceOfString( String originalString , String checkString)
    {
        //Checking original String is null
        if( originalString == null )
        {
            return null;
        }

        //originalString checks whether the checking String is present or not
        if( !originalString.contains(checkString))
        {
            return "Check String is not there!";
        }

        //Using Pattern matcher to find the occurance
        Pattern pattern=Pattern.compile(checkString);
        Matcher matcher=pattern.matcher(originalString);
        String posString="";

        while (matcher.find())
        {
            posString=posString+"Found at: " + matcher.start() + " - " + matcher.end()+" ";
        }
        posString=posString.trim();
        return posString;
    }
}
