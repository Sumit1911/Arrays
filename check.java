public class check {
    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int count = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                if(grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
        // int i = rows - 1;
        // int j = 0;

        // int result = 0;
        // while(i>=0 && j<columns) {
        //     if(grid[i][j]<0) {
        //         i--;
        //         result += columns - j;
        //     } else {
        //         j++;
        //     }
        // }
        
    }
    public static void main(String args[]) {
        int grid[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    
}
