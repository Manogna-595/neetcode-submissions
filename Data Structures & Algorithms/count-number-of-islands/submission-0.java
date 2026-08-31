class Solution {

    public void dfs(char[][] grid, int r, int c, boolean[][] vis){
        vis[r][c] = true;

        if(r-1 >= 0 && grid[r-1][c] == '1' && vis[r-1][c] == false){
            dfs(grid, r-1,c,vis);
        }
        if(c-1 >= 0 && grid[r][c-1] == '1' && vis[r][c-1] == false){
            dfs(grid, r,c-1,vis);
        }
        if(r+1 < grid.length && grid[r+1][c] == '1' && vis[r+1][c] == false){
            dfs(grid, r+1,c,vis);
        }
        if(c+1 < grid[0].length && grid[r][c+1] == '1' && vis[r][c+1] == false){
            dfs(grid, r,c+1,vis);
        }


    }
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count =0;

        for(int i=0;i<grid.length;i++){
            for(int j =0; j<grid[0].length; j++){
                if(grid[i][j] == '1' && vis[i][j] == false){
                    count++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return count;
        
    }
}
