import java.util.*;
import java.io.*;

public class StaticUniqueWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("Desktop/DSA code/Oxford English Dictionary.txt"));
        HashSet<String> set = new HashSet<>();
        int wcount = 0;
        double start = System.nanoTime();

        while (s.hasNext()) {
            wcount +=1;
            String word = s.next();

            if(! set.contains(word)) {
                set.add(word);
            }
        }
        double end = System.nanoTime();
        System.out.printf("total number of words: %d, unique #: %d\n", wcount, set.size());
        System.out.printf("time taken: %2.3g\n", (end-start)/1e9);
        s.close();


    }
}
//Code by Owen Astrachan- Professor of the Practice at Duke University
