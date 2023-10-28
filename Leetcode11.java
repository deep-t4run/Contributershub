class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while(left <= right){
            int length = right - left;
            int breadth = Math.min(height[left], height[right]);
            int area = length * breadth;
            maxArea = Math.max(area, maxArea);
            if(height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
