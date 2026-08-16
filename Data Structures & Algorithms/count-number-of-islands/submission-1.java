class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    private void bfs(int ro,int co,boolean[][] visit,char[][] gri){
        visit[ro][co] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro,co));
        int n=gri.length;
        int m = gri[0].length;
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            //travers neighbours
            int[] drow = {-1, 0, 1, 0};
            int[] dcol = {0, 1, 0, -1};

            for(int i = 0; i < 4; i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow>=0&&ncol>=0&&nrow<n&&ncol<m&&gri[nrow][ncol]=='1'&&!visit[nrow][ncol]){
                    visit[nrow][ncol] = true;
                    q.add(new Pair(nrow,ncol));
                }   
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,visited,grid);
                }
            }
        }
        return count;
    }
}
