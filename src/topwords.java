//prints an updated word cloud for each sufficiently long word read from the standard input (continuous stream of words)
//word length specified in minlength
import java.io.*;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class topwords {

    public static void main(String[] args) { //will accept three positive command-line arguments/integers: howmany, minlength, lastnwords
        //-----------------------------------------------------------------------------------------------   args[0]   args[1]    args[2]

        //calls to the three methods below, passing the args[0-2] parameters from the user

    }

    public static void readInput() throws IOException {
        //reading the words
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //preparing to receive input
        String line = reader.readLine();
        String[] words;


        //storing the words
        HashMap <String,Integer> wordBank;
        wordBank = new HashMap <String, Integer>();

        while (line != null) {
            words = line.split("[.,!?:;'] | \\s+"); //separating each line into individual words using whitespace and punctuation as a delimiter
            for(String word:words) {
                if(wordBank.containsKey(word)){
                    wordBank.put(word,wordBank.get(word)+1);
                }
                else {wordBank.put(word,1);}
            }
            line = reader.readLine();
        }

    }
}
