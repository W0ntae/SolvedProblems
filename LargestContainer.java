class LargestContainer {
  public int maxArea(int[] height) {
    int maxArea = 0, left = 0, right = height.length -1;
    while (left < right){
      if (height[left] < height[right]){
        int length = right - left;
        int area = length * height[left];
        if (area > maxArea){
          maxArea = area;
        }
        ++left;
      }
      else if (height[left] >= height[right]){
        int length = right - left;
        int area = length * height[right];
        if (area > maxArea){
          maxArea = area;
        }
        --right;
      }
    }
    return maxArea;
  }
}

int testing;