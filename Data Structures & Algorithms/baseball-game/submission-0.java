class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int n1=stack.pop();
                int n2=n1+stack.peek();
                stack.push(n1);
                stack.push(n2);
            }
            else if(op.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else 
            {
                stack.push(Integer.parseInt(op));
            }
        }
         int sum=0;
            for(int s:stack){
                sum+=s;
            }
            return sum;
    }
}