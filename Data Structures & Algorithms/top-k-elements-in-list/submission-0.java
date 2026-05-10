class Number implements Comparable<Number>{
    int element;
    int freq;
    Number(int e,int f){
        this.element=e;
        this.freq=f;
    }
    public int compareTo(Number that){
        return that.freq-this.freq;
    }

}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq=new PriorityQueue<>();
        HashMap<Integer,Integer> freqMap= new HashMap<>();
        for(int n:nums){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            Number num=new Number(entry.getKey(),entry.getValue());
            pq.offer(num);

        }
        int res[]=new int[k];
        int i=0;
        while(i<k){
            Number numb=pq.poll();
            res[i]=numb.element;
            i++;
        }
        return res;
    }
}
