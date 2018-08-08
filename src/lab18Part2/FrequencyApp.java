//Lauren Shindo

package lab18Part2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyApp {

	public static void main(String[] args) {

		int[] problemArray = {1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10};
		
		//to line 27 is the solution using arrays
		//estimated Big-O: O(n)
		int[] resultArray = new int[11];
		
		Arrays.fill(resultArray, 0);
		
		for (int entry : problemArray) {
			resultArray[entry]++;
		}
		
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print("[" + i + "]: ");
			System.out.println(resultArray[i]);
		}
		
		}
		
		//all of the below is for the HashMap version of the exercise:
		//estimated Big-O: O(n)
	
//		Map <Integer, Integer> freqMap = new HashMap<>();
//		
//		for (int entry : problemArray) {
//	          
//			if(freqMap.containsKey(entry)) {
//				freqMap.put(entry, freqMap.get(entry)+1);
//	        }
//	        else {
//	        	freqMap.put(entry, 1);
//	        }
//		}
		
//		System.out.println(freqMap);
	}

//}
