class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer>arr=new ArrayList<Integer>();
       for(int i:nums){
            if(!arr.contains(i)){
                arr.add(i);
            }
       }
       int j=0;
       for(int i:arr){
        nums[j++]=i;
       }
       return arr.size();
    }
}