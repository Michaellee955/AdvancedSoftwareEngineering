package problems100;

public class islandPerimeter {

    private static int application(int[][] grid){

        if (grid.length==0) return 0;
        int height = grid.length;
        int width = grid[0].length;
        int res = 0;
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                if (i-1<0 || grid[i-1][j]==0)
                    res ++;
                if (i+1>=height || grid[i+1][j]==0)
                    res ++;
                if (j-1<0 || grid[i][j-1]==0)
                    res ++;
                if (j+1>=width || grid[i][j+1]==0)
                    res ++;
            }
        }
        return res;
    }
}
