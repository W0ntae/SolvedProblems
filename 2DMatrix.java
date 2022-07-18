class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    for (int[] i : matrix){
      if (i[i.length -1] > target){
        for (int in : i){
          if(in < target){
            continue;
          }
          if(in == target){
            return true;
          }
        }
      }
    }
    return false;
  }
}