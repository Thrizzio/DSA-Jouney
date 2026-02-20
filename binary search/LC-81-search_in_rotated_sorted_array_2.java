class Solution {
    public boolean search(int[] nums, int target) {
        int l =0;
        int r = nums.length-1;

        while(l<=r){
            int mid = (l + r)/2;
            if(nums[mid]==target)return true;

            if(nums[mid]==nums[l] && nums[mid] == nums[r]){
                l++;
                r--;
                continue;
            }

            if(nums[mid]<=nums[r]){
                if(target>=nums[mid] && target <=nums[r]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            else{
                if(target>=nums[l] && target<=nums[mid] ){
                    r = mid -1;
                }
                else{
                    l = mid + 1;
                }
            }

        }
        return false;
    }
}

/*
Problem : 81
Platform : LeetCode
Concept : Binary Search
Diff : Medium

Intuition : so here what was the case that was making duplicates fail? it was when nums at l , mid , r where all equal so we cldnt correctly identify the sorted half, so what did we do , we moved those pointers till they were different and then at that point we were able to correctly identify the sorted half. then we just ran the code for basic searching in sorted arrays. 

learning : When we do problems that involve duplicates in any way we first look at the cases where the non-duplicate version of code is failing

TC : Worst Case = O(n) , Average Case = O(logn)
SC : O(1)
*/