class Solution {
    public int[] twoSum(int[] nums, int target) {
             HashMap<Integer,Integer> hm=new HashMap<>();
        int[]ans=new int[2];
        for(int i=0;i<nums.length;i++){

            int required_sum=target-nums[i];
            if(hm.containsKey(required_sum)){
                ans[0]=i;
                ans[1]=hm.get(required_sum);
                return ans;
            }
           hm.put(nums[i],i);
        }
        return ans;
    }
}