






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