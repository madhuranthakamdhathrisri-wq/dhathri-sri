class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        if(matrix == null||matrix.length == 0)
        {
            return new int[0][0];
        }
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int newRow = totalCol;
        int newCol = totalRow;

       int ans[][] = new int[newRow][newCol];

       for(int i = 0; i < newRow; i++)
       {
        for(int j = 0; j < newCol; j++)
        {
            ans[i][j] = matrix[j][i];
        }
       }
        return ans;
    }
}
