/**
 * a program with the implementation of Regular Expression to find the
 * presence of the name Harry in a string.
 *  Input: This is Harry.
 *  Output: Is Harry here ? true
 *  Input : This is Henry.
 */
package com.stackroute.PE4;

public class PresenceOfHarry {
    /*
    This method will check the presence of Harry in given String
     */
    public String checkHarry( String originalString )
    {
        //Checking original String is null
        if( originalString == null )
        {
            return null;
        }
        // Spliting String with regex = Harry
        String[] splitString=originalString.split("Harry");
        if( splitString.length > 1)
        {
            return "Is Harry here ? true";
        }
        else
        {
            return "Is Harry here ? false";
        }
    }

}
