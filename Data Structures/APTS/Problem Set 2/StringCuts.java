
import java.util.ArrayList;
import java.util.List;

//check the video explanation of this code @ https://youtu.be/VqTTUwZyTE8
public class StringCuts {

    
    public String[] filter (String[] list, int minLength) {
        List<String> array = new ArrayList<>();
     
        for(int i = 0;i<list.length;i++){
            if(list[i].length() >= minLength) {
                if(!array.contains(list[i])){
                array.add(list[i]);
                }
               
            } 
        }
 
        String[] newArray = new String[array.size()];

        for(int i=0;i<newArray.length;i++) {
            newArray[i] = array.get(i); 
        }
        return newArray;
    }

}

