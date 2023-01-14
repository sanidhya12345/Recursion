public class LargestLocalalues {
    private static int getMax(int[][] grid, int i, int j) {
        int max = grid[i][j];
        max = Math.max(max, grid[i][j - 1]);
        max = Math.max(max, grid[i - 1][j - 1]);
        max = Math.max(max, grid[i - 1][j]);
        max = Math.max(max, grid[i - 1][j + 1]);
        max = Math.max(max, grid[i][j + 1]);
        max = Math.max(max, grid[i + 1][j + 1]);
        max = Math.max(max, grid[i + 1][j]);
        max = Math.max(max, grid[i + 1][j - 1]);
        return max;
    }
    public static void main(String[] args) {
        int [][] array={{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        //System.out.println(calcmax(array, 0, array.length));
        for(int i=0;i<array.length-2;i++){
            for(int j=0;j<array.length-2;j++){
                int max=getMax(array, i+1, j+1);
                System.out.println(max);

            }
        }
    }
}
