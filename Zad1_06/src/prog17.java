public class prog17
{
    public static void main(String[] args)

    {
        String st1 = "a b c d";
        char[] charsArray = st1.toCharArray();
        StringBuffer strB = new StringBuffer();
        for (int i = 0; i < charsArray.length; i++)
        {
            if( (charsArray[i] != ' ') && (charsArray [i] != '\t') )
            {
                strB.append(charsArray [i]);
            }
        }
        System.out.println(strB);          
    }
}