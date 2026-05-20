class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> vals=new ArrayList<>();
        for(int num:nums){
            if(num!=val){
                vals.add(num);
            }
        }
        for(int i=0;i<vals.size();i++){
            nums[i]=vals.get(i);
        }
        return vals.size();
     }
}