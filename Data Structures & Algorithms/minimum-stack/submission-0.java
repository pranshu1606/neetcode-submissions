class MinStack {
    int topp = -1;
    ArrayList<Integer> list;
    public MinStack() {
        list =  new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        topp = val;
    }
    
    public void pop() {
        if(list.isEmpty()){
            topp = -1;
        }
        else{
            list.remove(list.size()-1);
        }
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int x : list){
            min = Math.min(min, x);
        }
        return min;  
    }
}
