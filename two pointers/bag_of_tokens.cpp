#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        
        sort(tokens.begin(),tokens.end());
        int l=0,r=tokens.size()-1;
        int score =0;
        int maxScore = 0;
        while(l<=r){
            if(power>=tokens[l]){
                score++;
                power -= tokens[l];
                l++;
                maxScore = max(maxScore,score);
            }
            else if(score > 0 && power<tokens[l]){
                score--;
                power += tokens[r];
                r--;
            }
            else{
                break;
            }
        }
        
        return maxScore;
    }
};

/*
Problem : 948
Platform : LeetCode
Pattern : Greedy + Two Pointers

Initial Idea: It was to gain score everytime my power was less than token , but that is very illogical

Intuition: You gain the max power possible by keeping a right pointer at the max token and therefore you are being Greedy by adding the maxPower to your power , making it so that it is the best option you can have.

TC = O(nlogn);
SC = O(1);

*/