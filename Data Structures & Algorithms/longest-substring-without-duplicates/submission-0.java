class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> set=new HashSet<>();
      int n=s.length();
      int l=0;
      int r=0;
      int res=0;
      while(l<=r && r<n){
        while(set.contains(s.charAt(r))){
            set.remove(s.charAt(l));
            l++;
        }
        set.add(s.charAt(r));
        res=Math.max(res,r-l+1);
        r++;
      }
      return res;
    }
}
