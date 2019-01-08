import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceOfString {

    public String findOcuuranceOfString( String originalString , String checkString)
    {
        if( originalString == null )
        {
            return null;
        }
        if( !originalString.contains(checkString))
        {
            return "Check String is not there!";
        }
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
