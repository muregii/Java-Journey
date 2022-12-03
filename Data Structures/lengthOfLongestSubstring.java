import java.util.*;
import java.io.*;

public int LongestSubstring (String s) {
    int max = 1;
    if(s.length() == 0) return 0;

    for(int j=0; j < s.length(); j++) {
        for(int k=j+1; k<= s.length(); k++) { //  Standard loops over every pair
            String sub = s.substring(j,k);//creating a substring, starting from j and going to k
            HashSet <character> set = new HashSet<>(); //Putting all the characters from the substring into a hash set
            for(char ch : sub.toCharArray()) set.add(ch);//Checking the size of the set to see if its equal to the length of the string 
            if(k-j == set.size()) { //if the size of the set is equal to the length of the string they are all unique because the set stores only unique elements
                max = Math.max(max,k-j); //So I update the value of max 
            }
        }
    }
    return max;
}

