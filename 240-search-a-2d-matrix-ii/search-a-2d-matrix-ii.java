class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length;
        int cols = arr[0].length;
        int i = 0;
        int j = cols - 1;
        while (i < row && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            } else if (arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}