class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1+n2;
        int res[] = new int[n];
        int i=0,j=0,k=0;
        while(i<=n1 && j<=n2){
            if(i==n1){
                while(j<n2){
                    res[k++] = nums2[j++];
                }
                break;
            }else if(j==n2){
                while(i<n1){
                    res[k++] = nums1[i++];
                }
                break;
            }
            if(nums1[i]<nums2[j]){
                res[k++] = nums1[i++];
            }else{
                res[k++] = nums2[j++];
            }
        }
        if (n%2==0) return (float)(res[n/2-1] + res[n/2])/2;
        else return res[n/2];
    }
}