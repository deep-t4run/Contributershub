class Solution {
    public int maxElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public int sumByDivisor(int[] nums, int divisor){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double)nums[i] / (double)divisor);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 0; 
        int high = maxElement(nums);
        while(low <= high){
            int mid = low + (high - low) / 2;
            int sum = sumByDivisor(nums, mid);
            if(sum <= threshold){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
