class Solution {
    private static void merge(int nums[], int l, int mid, int r){
        // int max_cnt = 0;
        // int j = mid +1;
        // for(int i=l; i<=mid; i++){
        //     while(j<=r && nums[i] > (2*(long)))
        // }

        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid+1;
        
        while(left<=mid && right<=r){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=r){
            temp.add(nums[right]);
            right++;
        }

        for(int i=l; i<=r; i++){
            nums[i] = temp.get(i-l);
        }
    }

    public static int countPairs(int nums[], int l, int mid, int r){
        int right = mid+1;
        int cnt = 0;
        for(int i=l; i<=mid; i++){
            while(right<=r && nums[i]>(2*(long)nums[right])){
                right++;
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    
    private int mergeSort(int nums[], int l, int r){
        int cnt = 0;
        if(l>=r) return cnt;
        
        int mid = l+(r-l)/2;
        cnt += mergeSort(nums,l,mid);
        cnt += mergeSort(nums,mid+1,r);
        cnt += countPairs(nums,l,mid,r);
        merge(nums,l,mid,r);
        return cnt;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}