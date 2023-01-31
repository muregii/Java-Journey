
import java.util.TreeSet;

public class StringCuts {
    
    public String[] filter (String[] list, int minLength) {
        TreeSet<String> uniqueList = new TreeSet<>();
        for(String w: list){
            if(w.length()>= minLength) {
               uniqueList.add(w);
            }          

        }

        String[] newArray = new String[uniqueList.size()];
        int count = 0;
        for(String w: uniqueList) {
           newArray[count] = w;
           count++; 
        }

        return newArray; 
        
    }


}
