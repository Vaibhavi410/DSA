class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++ ){
            String k=String.valueOf(nums[i]);
            if(k.length()%2==0){
                ans++;
            }
        }
        return ans;
    }
}