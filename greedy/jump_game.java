class Solution {
    public boolean canJump(int[] nums) {
        int maxTotal=0;
        for(int i=0;i<nums.length;i++){
            if(maxTotal<i)return false;

            maxTotal = Math.max(maxTotal,i+nums[i]);
            if(maxTotal >=nums.length-1)return true;
        }

        return true;
        
    }
}