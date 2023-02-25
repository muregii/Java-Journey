/* Give an array of integers [nums] and an integer [target], return indices of the two numbers such that they add up to the target*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
      // two sum quiz
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      if (numToIndex.containsKey(target - nums[i]))
        return new int[] {numToIndex.get(target - nums[i]), i};
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException();
  }
}  

/*import java.util.*;

//{1, 300 } ==> 301 . Return [0, 1]
public class twoSum{

    public int[] solution(int[] nums, int target){ 
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; ++i) {
        if(numToIndex.containsKey(target - nums[i]))
        return new int[] {numToIndex.get(target - nums[i]), i};
      
        numToIndex.put(nums[i], i);
         
    }
    throw new IllegalArgumentException();
}
//Test results
public static void main(String[] args) {
    twoSum obj = new twoSum();
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(obj.solution(nums, target)));
    
  }
}*/
       
