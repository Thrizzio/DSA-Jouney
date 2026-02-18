// #include<bits/stdc++.h>
// using namespace std;

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

/*
Problem : 55
Platform : LeetCode
Pattern : Greedy
Difficulty : Hard

Initial Thoughts: To try every single combination of every single possible route, could not implement and unecessary computation usage.

Intuition : Initialize a variable to see what the maxIndex you can go to is, but , if the index you are at right now is greater than the maxIndex it can go to till then , then , return false, but , return true if the maxIndex >= n-1 or if entire array is traversed.

TC : O(n)
SC = O(1)

*/