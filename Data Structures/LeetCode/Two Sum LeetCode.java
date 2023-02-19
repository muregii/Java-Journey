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
       
