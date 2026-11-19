class Solution {
    public int majorityElement(int[] nums) {
        int m=nums[0],c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==m){
                c++;
            }
            else if(c==0){
                m=nums[i];
                c=1;
            }else{
                c--;
            }
        }
        return m;
    }
}