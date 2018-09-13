package problems100;

public class minPathSum {

    public static int application(int[][] grid){
        if (grid==null) return -1;
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        if (m==0 && n==0) return -1;
        if (m==0){
            int j=0;
            while(j<n) res += grid[0][j++];
            return res;
        }else if (n==0){
            int i=0;
            while(i<m) res += grid[i++][0];
            return res;
        }else{
            for (int i=1;i<m;i++){
                for (int j=1;j<n;j++){
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}
