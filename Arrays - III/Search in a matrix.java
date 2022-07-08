class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int loIdx = 0;
        int hiIdx = row*col-1;
        
        while(loIdx <= hiIdx){
            int mid = (loIdx + hiIdx) /2;
            if(matrix[mid/col][mid%col] == target){
                return true;
            }
            if(matrix[mid/col][mid%col] > target){
                hiIdx = mid-1;
            }else{
                loIdx = mid+1;
            }
            
        }
        return false;
        
    }
}