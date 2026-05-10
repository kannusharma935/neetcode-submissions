class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> fm=new HashMap<>();
        
        
        for(String s:strs){
           int count[]=new int[26];
           for(char c:s.toCharArray()){
            count[c-'a']++;
           } 
           String key=Arrays.toString(count);
           fm.putIfAbsent(key,new ArrayList<>());
           fm.get(key).add(s);
        }
        return new ArrayList<>(fm.values());


        }
}
