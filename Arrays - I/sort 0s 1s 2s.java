class Solution {
    public void sortColors(int[] nums) {
        int zeroPointer=0,onePointer=0,twoPointer=nums.length-1;
        while(onePointer<=twoPointer){
            if(nums[onePointer] == 0){
                int temp = nums[zeroPointer];
                nums[zeroPointer++] = nums[onePointer];
                nums[onePointer++] = temp; 
            }
            else if(nums[onePointer] == 1){
                onePointer++;
            }else{
                int temp = nums[onePointer];
                nums[onePointer] = nums[twoPointer];
                nums[twoPointer--] = temp;
            } 
        } 
    }
}