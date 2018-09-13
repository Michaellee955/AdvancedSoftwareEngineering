package problems100;

public class NumberofIslands {

    private static int app(int[][] grid){
        if (grid==null || grid.length==0)
            return 0;
        int res = 0;
        for (int i=0;i<grid[0].length;i++){
            for (int j=0;j<grid.length;j++){
                if (grid[j][i]==1){
                    res ++;
                    ViewIsland(grid,i,j);
                }
            }
        }
        return res;
    }

    private static void ViewIsland(int[][] grid, int i, int j){
        if (j>=grid.length || i>=grid[0].length||grid[j][i]==0) {
            return;
        }else if(grid[j][i]==1){
            grid[j][i] = 0;
            ViewIsland(grid,i+1,j);
            ViewIsland(grid,i,j+1);
        }
    }

}
