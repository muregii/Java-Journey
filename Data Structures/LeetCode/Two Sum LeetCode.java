/* Give an array of integers [nums] and an integer [target], return indices of the two numbers such that they add up to the target*/

class Solution {
  public int[] twosum( int[] nums, int target) {
    Map<Integer, Integer>numToIndex = new Hashmap<>();
    
   for(int i<0; i<nums.length[i];i++){
     if(numToIndex.containsKey(target - nums[i]){
       return new int[] { numToIndex.get(target - nums[i]), i}
        }
        numToIndex.put(nums[i], i);
     throws new IllegalArgumentException();
}
}
                                         
       
