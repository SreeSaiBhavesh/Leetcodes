import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		int xr = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(xr,1);
		int cnt = 0;

		for(int i=0; i<arr.size(); i++){
			xr = xr^arr.get(i);
			int xx = xr ^ x;
			if(map.containsKey(xx)){
				cnt += map.get(xx);
			}

			if(map.containsKey(xr)){
				map.put(xr, map.get(xr)+1);
			}else{
				map.put(xr,1);
			}
		}
		return cnt;
	}
}