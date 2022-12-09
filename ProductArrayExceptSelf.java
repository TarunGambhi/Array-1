//TC:O(n)
//SC: O(1)
//https://leetcode.com/problems/product-of-array-except-self/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int rp = 1;
        result[0]=rp;
        for(int i=1;i<nums.length;i++){
            rp*=nums[i-1];
            result[i]= rp;
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}
