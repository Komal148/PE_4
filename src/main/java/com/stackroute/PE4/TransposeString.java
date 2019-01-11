/**
 *  a program to transpose the given string.
 *  Input String : a quick brown fox jumps over the lazy dog
 *  Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god
 */
package com.stackroute.PE4;

import java.util.Scanner;

public class TransposeString {

    /*
    This method will reverse the String and return it.
     */
    public String reverseStringMethod(String originalString) {

        //Check whether the string is null
        if (originalString == null) {
            return "Original String is null";
        }

        //split String on the basis of " "
        String[] splitStrings = originalString.split(" ");
        String reverseString = "";

        //looping through the string array and adding in reverse Order
        for (String subString : splitStrings) {
            StringBuilder splitReverse = new StringBuilder(subString);
            splitReverse.reverse();
            reverseString = reverseString + splitReverse.toString() + " ";
        }

        reverseString = reverseString.trim();
        return reverseString;
    }
}
