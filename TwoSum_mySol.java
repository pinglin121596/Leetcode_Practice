class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 1;
            
        for(int i = 0; i <= nums.length - 2; i++){ \\ fix one value
            for(int j = i + 1; j <= nums.length - 1; j++){ \\ go through the whole array to find the other value
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;           
                    return result;
                }
             }
        }
        
        return result;
    }
}
