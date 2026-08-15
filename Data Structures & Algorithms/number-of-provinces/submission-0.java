class Solution {
    private void dfs(int node, int[][] arr,boolean[] visit){
        visit[node] = true;
        for(int neighbour=0;neighbour<arr.length;neighbour++){
            if(arr[node][neighbour]==1&& !visit[neighbour]){
                dfs(neighbour,arr,visit);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int provinces =0;
        boolean[] visited = new boolean[n];
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                provinces++;
                dfs(i,isConnected,visited);
            }
        }
        return provinces;
    }
}