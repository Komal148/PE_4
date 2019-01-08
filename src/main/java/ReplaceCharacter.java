public class ReplaceCharacter {

    public String replaceCharcterMethod(char original1,char replace1 , char original2 , char replace2 ,String originalString)
    {
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
