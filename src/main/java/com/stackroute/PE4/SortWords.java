/**
 * a program that sets up a String variable containing a paragraph of text.
 * a. Extract the words from the text and sort them into alphabetical order.
 * b. Display the sorted list of words.
 */
package com.stackroute.PE4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortWords {

    /*
    This method will sort the words of the string and then return it.
     */
    public String wordSortingMethod( String originalString)
    {
        //Checking original String is null or not
        if( originalString == null )
        {
            return null;
        }

        //Splitting the String on the basis of " "
        String splitString[] =originalString.split(" ");
        String replaceString="";

        //Looping through the String Array
        for( String subString : splitString) {

            //declaring a Character array WordArray
            Character[] wordsArray = new Character[subString.length()];

            for (int i = 0; i < wordsArray.length; i++) {
                wordsArray[i] = subString.charAt(i);
            }

            //Sorting the wordArray
            Arrays.sort(wordsArray, new Comparator<Character>() {

                public int compare(Character c1, Character c2) {
                    // ignoring case
                    return Character.compare(Character.toLowerCase(c1),
                            Character.toLowerCase(c2));
                }

            });

            //Converting that Character array into String
            for( Character c : wordsArray )
            {
                replaceString=replaceString+Character.toString(c);
            }
            replaceString+=" ";
        }
        replaceString=replaceString.trim();
        return replaceString;
    }
}
