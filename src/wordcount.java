import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class wordcount {

    public static void iterator(int minlength) throws IOException {

//      reading the words
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// Reader reader = new FileReader(filename); for a file
//                                                                                      Reader reader = new InputStreamReader(socket.getInputStream()); for an application
        String line = reader.readLine();
        String[] splitter = line.toLowerCase().split("\\W+");

//      Storing the words
        HashMap<String,Integer> wordBank = new HashMap<>();

        while (line != null) {
            for (String words : splitter) {
                if (wordBank.containsKey(words)) { //&& words.length() > minlength
                    wordBank.put(words, wordBank.get(words) + 1); //increase occurrence value of the word if its present in wordbank
                }
                else {
                    wordBank.put(words, 1); //store word in wordbank and increase occurrence by 1
                }
                System.out.println(wordBank); //print the updated wordbank after every word is handled
            }
            line = reader.readLine(); //move on to next line of text
        }
    }

    public void sortWords(){ //will handle sorting the wordbank, possibly with treemap

    }
}