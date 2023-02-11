class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return null;
        }else if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }else{
            int list[] = {};
            first = list1[0];
            second = list2[0];
            int i=0; j=0;
            while(list1!=null && list2!=null && i<list1.length && j<list2.length){
                if(first<second){
                    list.append(first);
                    first = list1[i+1];
                    i = i+1;
                }else{
                    list.append(second);
                    j = j+1;
                    second = list2[j];
                }
            }
        }
        return list;
    }
}