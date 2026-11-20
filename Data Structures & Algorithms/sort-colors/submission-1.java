class Solution {
    public void sortColors(int[] nums) {
        int start=0,mid=0,end=nums.length-1;
        while(mid<=end){
            if (nums[mid] == 0) {
                swap(mid, start, nums);
                start++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(mid, end, nums);
                end--;
            }
        }
    }
    public void swap(int a,int b,int []arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}