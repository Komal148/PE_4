/**
 * a java program to count the total number of occurrences of a
 * given character in a string without using any loop.
 * For Example- Java is java again java again
 * count number of occurrence of a in the given string
 */
package com.stackroute.PE4;

public class CountNumOfOccurance {
    /*
    This method will count Number of occurances.
     */
    public int countNumOccurance(String checkString,char checkCharacter)
    {
        //Checking whether checkString is null or not
        if( checkString != null)
        {
            String regexString=Character.toString(checkCharacter);
            String[] splitString=checkString.split(regexString);
            return splitString.length-1;
        }
        return  0;

    }
}
