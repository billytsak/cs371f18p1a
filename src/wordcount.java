import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class wordcount {

    public void iterator(int minlength) throws IOException {

//      reading the words
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] splitter = line.toLowerCase().split("\\W+");

//      Storing the words
        HashMap<String,Integer> wordBank = new HashMap<>();

        while (line != null) {
            for (String words : splitter) {
                if (wordBank.containsKey(words)) { //&& words.length() > minlength
                    wordBank.put(words, wordBank.get(words) + 1);
                }
                else {
                    wordBank.put(words, 1);
                }
                System.out.println(wordBank);
            }

            line = reader.readLine();
        }
    }
}
