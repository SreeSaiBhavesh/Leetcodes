class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hp = new HashSet<Integer>();
        HashSet<Integer> hp2 = new HashSet<Integer>();
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(int i:nums1){
            hp.add(i);
        }
        for(int i:nums2){
            if(hp.contains(i)){
                hp.remove(i);
            }
        }
        for(int i:nums2){
            hp2.add(i);
        }
        for(int i:nums1){
            if(hp2.contains(i)){
                hp2.remove(i);
            }
        }
        res.add(new ArrayList<Integer>(hp));
        res.add(new ArrayList<Integer>(hp2));
        return res;
    }
}