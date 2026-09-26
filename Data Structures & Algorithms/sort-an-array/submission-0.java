class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    public int[] mergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public int[] merge(int []left, int []right){
        int i=0,j=0,k=0;
        int []res=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                res[k++]=left[i++];
            }
            else{
                res[k++]=right[j++];
            }
        }
        while(i<left.length){
            res[k++]=left[i++];
        }
        while(j<right.length){
            res[k++]=right[j++];
        }
        return res;
    }

}