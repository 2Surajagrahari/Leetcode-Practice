class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int s= 0;
        int e = cols * rows - 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int row = mid / cols;
            int col = mid % cols;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col]>target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return false;
    }
}