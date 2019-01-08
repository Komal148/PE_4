public class PresenceOfHarry {
    public String checkHarry( String originalString )
    {
        if( originalString == null )
        {
            return null;
        }
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
