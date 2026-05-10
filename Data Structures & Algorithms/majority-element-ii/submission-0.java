class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> count=new HashMap<>();

        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            if(entry.getValue()>Math.round(n/3)){
                res.add(entry.getKey());
            }
        }
        return new ArrayList<>(res);
    }
}