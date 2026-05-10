class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> freqmap=new HashMap<>();
       PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

       for(int num:nums){
        freqmap.put(num,freqmap.getOrDefault(num,0)+1);
       } 

       for(Map.Entry<Integer,Integer> entry:freqmap.entrySet()){
        pq.offer(new int[]{entry.getValue(),entry.getKey()});
        
       }
       int res[]=new int[k];
       for(int i=0;i<k;i++){
        res[i]=pq.poll()[1];
       }
       return res;
    }
}
