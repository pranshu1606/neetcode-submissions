class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left1 = 0;
        int right1 = matrix.length-1;
        int mid1 = 0;
        while(left1<=right1){
            mid1 = (left1) + (right1-left1)/2;
            int left2=0;
            int right2 = matrix[mid1].length-1;
            if(matrix[mid1][left2]<=target && target<=matrix[mid1][right2]){
                if((matrix[mid1][left2]==target)||(target==matrix[mid1][right2])){
                    return true;
                }
                while(left2<=right2){
                    int mid2 = left2 + (right2-left2)/2;
                    if(target>matrix[mid1][mid2]){
                        left2 = mid2+1;
                    }
                    else if(target<matrix[mid1][mid2]){
                        right2 = mid2-1;
                    }
                    else if(target==matrix[mid1][mid2]){
                        return true;
                    }
                }
                return false;
            }
            else if(matrix[mid1][left2]>target){
                right1 = mid1-1;
            }
            else if(matrix[mid1][right2]<target){
                left1 = mid1+1;
            }
        }
        return false;
    }
}
