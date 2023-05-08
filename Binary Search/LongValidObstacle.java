class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int length = obstacles.length;
    int longestObstacleCourse[] = new int[length]; 
    int lis[] = new int[length]; 
    int lisLength = 0; 

    for (int i = 0; i < length; i++) {
        int left = 0, right = lisLength;
       
        while (left < right) {
            int middle = (left + right) >> 1;
            if (lis[middle] <= obstacles[i]) left = middle + 1;
            else right = middle;
        }
        
        if (left >= lisLength || lis[left] > obstacles[i]) lis[left] = obstacles[i];
        
        if (left == lisLength) lisLength++;
    
        longestObstacleCourse[i] = left + 1;
    }
    return longestObstacleCourse;
}
}