/**
 * class WordPlay provides an example of a recursive methods.
 * 
 * @author (PM Davies) 
 * @version (2018-08-26)
 */
public class WordPlay
{
    public static void stackWords()
    {
        String word = Keyboard.readString(); //read user input
        if (word.equals ("."))
            System.out.println();
        else
            stackWords();
        System.out.println(word);
    }

    public static void main(String args[])
    {
        System.out.println("Enter list of words, one per line");
        System.out.println("Final words should be a fullstop");
        stackWords();
    }

    
}
