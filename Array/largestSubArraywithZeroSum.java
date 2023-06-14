import java.io.*;
import java.util.* ;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,-1);
		int max=0, sum=0;
		for(int i=0; i<arr.size(); i++){
			sum+=arr.get(i);
			if(map.containsKey(sum)) max = Math.max(max, i-map.get(sum));
			map.putIfAbsent(sum, i);
		}
		return max;
	}
}