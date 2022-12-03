import java.util.*;

public class LongestSubString {
    // A map takes keys and maps them to values.
    //A map is very efficient, it's constant time O(n), it has keys and values.
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap <Character,Integer> map = new HashMap<>();
        int max = 1;
        int start = 0;
        map.put(s.chartAt(0)/*character @ index zero*/, 0/*the index*/);//This says that the key in the map is a character, and the value is the index in my string at which that character occurs. Isn't it true that my zero(th) character occur at index zero?
        for(int index = 1; index < s.length(); index++) { //This code runs in linear time... [Invariant Holds]
            char ch = s.charAt(index); //The index at which ch'(es) occur is index
            if(map.containsKey(ch) && map.get(ch) >= start) {//Is the current character (-ch) in the map AND in my window/(How do I know that its in my window? If its location is bigger than start)?
                start = map.get(ch) +1;
             }
             map.put(ch, index);//Updating the map
             max = math.max(max,index-start+1);// [Invariant re-established]
        }
        return max;
             
    }
    
//Using an array instead of a map
//An array takes an index and a value at that location
public int lengthOfLongestSubstring2 (String s) {
    if (s.length() == 0) return 0;
    int[] map = new int[256];
    Arrays.fill(map,-1);
    int max =1;
    int start = 0;
    map [s.charAt(0)] = 0;//Invariant holds
    for (int k=1; k< s.length(); k+=1) {
        char ch = s.charAt(k);
        if(map[ch] >= start) {
            start = map[ch] + 1;
        }
        map[ch] = k;
        max = Math.max(max,k-start+1);
    }
    return max;
}

}