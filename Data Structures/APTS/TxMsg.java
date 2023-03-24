import java.util.*;

public class TxMsg {
    public String getMessage(String original) {
        // code here
        HashSet<String> result = new HashSet<>(Arrays.asList(new String[] {"a","e","i","o","u"}));
        String[] words = original.split(" ");
        String word = "";

        for (int i=0;i<words.length;i++) {
            for (int j=0;j<words[i].length();j++) {
                if (!result.contains(words[i].substring(j,j+1))) {
                    if (j==0) {
                        word += words[i].substring(j,j+1);
                        continue;
                    }

                    if (result.contains(words[i].substring(j-1,j))) {
                        word += words[i].substring(j,j+1);
                    }
                }
            }
            if (word.length() != 0) {
                words[i] = word;
            }
            word = "";
        }

        return String.join(" ", words);
    }
}