package DevelhopeJavaProgramming;

/**
 * @author KNS
 * class that takes two methods, addHelloWord and getFullName
 * both methods returns string parameters
 */
public class WordGames {
    /**
     * Wordgames: takes one parameter as input
     * @param word: it takes word of the wordsgames
     * @return returns string format for the word
     */
    public static String addHelloWord(String word){

        return String.format("Hello %s%n", word);
    }

    /**
     *
     * @param name
     * @param surname
     * @return returns string concat of name and surname
     */
    public static String getFullName( String name, String surname){
        return String.format("Name: %s %s%n", name, surname);
    }
}
