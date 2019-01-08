import java.util.Scanner;

public class TransposeString {
    public String reverseStringMethod(String originalString)
    {
        if( originalString == null )
        {
            return "Original String is null";
        }
        String[] splitStrings=originalString.split(" ");
        String reverseString="";

        for( String subString : splitStrings )
        {
            StringBuilder splitReverse= new StringBuilder(subString);
            splitReverse.reverse();
            reverseString=reverseString+splitReverse.toString()+" ";
        }

        reverseString=reverseString.trim();
        return reverseString;

    }

    public static void main(String[] args)
    {
        TransposeString sortWords=new TransposeString();
        Scanner input=new Scanner(System.in);
        String originalString="";
        originalString=input.nextLine();
        System.out.println(sortWords.reverseStringMethod(originalString));
    }
}
