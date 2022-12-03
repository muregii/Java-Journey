import java.util.*;
import java.io.*;

//for some reason, this code is not running, probably its arbitrary, no values have been provided
public int removeDuplicatesSorted(int [] nums) {
    int lastIndex = 0;//initialize before loop to be true first time
    for(int k=1; k<nums.length; k++) { 
        if(nums[lastIndex]<nums[k]);//check the last number and compares it to the incoming value
        lastIndex += 1;//if incoming integer if larger, add a new space in the set infront of the previous last number
        nums[lastIndex] = nums[k]; //copy the new integer into that memory.

    }
}

//Using a Hashset for unsorted removal of duplicates
public int removeDuplicatesSorted(int[] nums) {
    Set<Integer> set = new HashSet<>(); //used for unsorted arrays or set
    int lastIndex = 0;
    set.add(nums[0]);
    for(int k=1; k< nums.length; k++) { //check all k values
        if( ! set.contains(nums[k])) { //check if the new number is not in the set
            lastIndex += 1; //if its not, add one new index
            nums[lastIndex] = nums[k]; //copy the new integer into that index
            set.add(nums[k]);//add the new integer to the hashset
        }
    }
    return lastindex;
}
