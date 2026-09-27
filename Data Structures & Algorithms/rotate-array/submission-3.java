class Solution {
    public void rotate(int[] nums, int k) {
       if(k>nums.length){
        k=k%nums.length;
       }
       rotate_array(nums,k);
    }

    // public void rotate_array(int[] nums,int k){
    //     int []arr=Arrays.copyOfRange(nums,0,nums.length-k);
    //     int []arr2=Arrays.copyOfRange(nums,nums.length-k,nums.length);
        
    //     int i=0;
    //     for(int j=0;j<arr2.length;j++){
    //         nums[i++]=arr2[j];
    //     }
    //     for(int j=0;j<arr.length;j++){
    //         nums[i++]=arr[j];
    //     }
    // }

    public void rotate_array(int []nums,int k){
        int i=0,j=nums.length-1;
        reverse(nums,i,j);
        reverse(nums,i,k-1);
        reverse(nums,k,j);

    }
    public void reverse(int[]nums, int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }


}