//TC:O(mn)
//SC : O(mn)
//https://leetcode.com/problems/diagonal-traverse
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int idx = 0;
        boolean dir = true;
        int m = mat.length;
        int n = mat[0].length;
        int row=0;
        int col=0;
        int[] result = new int[m*n];
        while(idx < m*n){
            result[idx] = mat[row][col];
            idx++;
            if(dir){
                if(col == n-1){
                    row++;
                    dir=false;
                }else if(row == 0){
                    col++;
                    dir=false;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row==m-1){
                    col++;
                    dir=true;
                }else if(col==0){
                    row++;
                    dir=true;
                }else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
