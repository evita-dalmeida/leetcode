// Leetcode 3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int maxLength = 0;
        int start = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            
            if(map.containsKey(s.charAt(i))){
                start = Math.max(start,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            if(maxLength< i - start +1)
                maxLength = i - start+1;
     }
        return maxLength;
    }
}
// abcabcbb