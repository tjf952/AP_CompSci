public class ValidSSNdemo
{
    public static void main(String[] args)
    {
        System.out.println(validSSN("123-45-6789")); // good
        System.out.println(validSSN("023-45-6789")); // good
        System.out.println(validSSN("023-4-6789")); // bad
    }
    
    // XXX-XX-XXXX
    public static boolean validSSN(String ssn)
    {
        String [] tokens = ssn.split("-");
        if (tokens.length !=3) return false; // wrong number of parts
        if (tokens[0].length() !=3) return false;
        if (tokens[1].length() !=2) return false;
        if (tokens[2].length() !=4) return false;
        for (int i=0; i<3; ++i)
            for (int j=0; j<tokens[i].length(); ++j)
            {
                char digit = tokens[i].charAt(j);
                if (Character.isDigit(digit) == false)
                    return false;  // all the elements should be digits
            }
        return true; // if we get here, everything was fine
    }
}
