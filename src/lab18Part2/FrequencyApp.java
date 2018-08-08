package lab18Part2;

import java.util.HashMap;
import java.util.Map;

public class FrequencyApp {

	public static void main(String[] args) {

		int[] problemArray = {1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10};
		
		Map <Integer, Integer> freqMap = new HashMap<>();
		
		for (int entry : problemArray) {
	          
			if(freqMap.containsKey(entry)) {
				freqMap.put(entry, freqMap.get(entry)+1);
	        }
	        else {
	        	freqMap.put(entry, 1);
	        }
		}
		
		System.out.println(freqMap);
	}

}
