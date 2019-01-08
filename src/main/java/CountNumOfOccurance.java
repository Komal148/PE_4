public class CountNumOfOccurance {

    public int countNumOccurance(String checkString,char checkCharacter)
    {
        if( checkString != null)
        {
            String regexString=Character.toString(checkCharacter);
            String[] splitString=checkString.split(regexString);
            return splitString.length-1;
        }
        return  0;

    }
}
