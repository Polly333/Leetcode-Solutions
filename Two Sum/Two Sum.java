class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Creating Empty hash map 
        for(int i = 0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))// here array ele are keys
            {
                return new int[]{i,map.get(target - nums[i])};//int [] syntax
                //instantiation and initialization
            }
            map.put(nums[i],i);
        }
        return new int[0]; // empty array of integers
        
    }
}