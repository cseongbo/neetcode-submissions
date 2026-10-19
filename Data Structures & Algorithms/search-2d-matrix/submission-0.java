class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        int r = matrix.length;
        int c = matrix[0].length;

        int i = 0, j = r * c - 1;

        while (i <= j) {

            int mid = (i + j) / 2;

            if (matrix[mid / c][mid % c] == target) {

                return true;

            } else if (matrix[mid / c][mid % c] < target) {

                i = mid + 1;

            } else {
                j = mid - 1;
            }

        }

        return false;
        
    }
}
