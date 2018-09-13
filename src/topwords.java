//prints an updated word cloud for each sufficiently long word read from the standard input (continuous stream of words)

public class topwords {

    public static void main(String[] args) { //will accept three positive command-line arguments/integers: howmany, minlength, lastnwords
        //-----------------------------------------------------------------------------------------------   args[0]   args[1]    args[2]

        //calls to the three methods below, passing the args parameters from the user
        int howmany = Integer.parseInt(args[0]);
        int minlength = Integer.parseInt(args[1]);
//        wordcount.iterator(minlength);
        int lastnwords = Integer.parseInt(args[2]);
    }
        //Reader reader = new FileReader(filename); //for a file
        //Reader reader = new InputStreamReader(socket.getInputStream()); //for an application

}
