import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortWords {


    public String wordSortingMethod( String originalString)
    {
        if( originalString == null )
        {
            return null;
        }
        String splitString[] =originalString.split(" ");
        String replaceString="";
        for( String subString : splitString) {
            Character[] wordsArray = new Character[subString.length()];

            for (int i = 0; i < wordsArray.length; i++) {
                wordsArray[i] = subString.charAt(i);
            }
            Arrays.sort(wordsArray, new Comparator<Character>() {

                public int compare(Character c1, Character c2) {
                    // ignoring case
                    return Character.compare(Character.toLowerCase(c1),
                            Character.toLowerCase(c2));
                }

            });
            for( Character c : wordsArray )
            {
                replaceString=replaceString+Character.toString(c);
            }
            replaceString+=" ";
        }
        replaceString=replaceString.trim();
        return replaceString;

    }

    public static void main(String[] args)
    {
        SortWords sortWords=new SortWords();
        Scanner input=new Scanner(System.in);
        String originalString="";
        originalString=input.nextLine();
        System.out.println(sortWords.wordSortingMethod(originalString));
    }
}
