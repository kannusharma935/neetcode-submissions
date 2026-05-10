class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0,r=0;
        StringBuilder res=new StringBuilder();
        while(l<word1.length() ||r<word2.length()){
            if(l<word1.length()){
                res.append(word1.charAt(l++));
            }
            if(r<word2.length()){
                res.append(word2.charAt(r++));
                
            }

        }
        return res.toString();
    }
}