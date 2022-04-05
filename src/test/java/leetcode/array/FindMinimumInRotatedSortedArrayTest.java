package leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FindMinimumInRotatedSortedArrayTest {
	
	static FindMinimumInRotatedSortedArray solution; 
	static Map<int[], Integer> inputs;

	@BeforeAll
	static void setup() {
		solution = new FindMinimumInRotatedSortedArray();
		inputs = new HashMap<>();
//		inputs.put(new int[]{3,4,5,1,2}, 1);
//		inputs.put(new int[]{4,5,6,7,0,1,2}, 0);
		inputs.put(new int[]{2,1}, 1);
//		inputs.put(new int[]{1}, 1);
	}

	@Test
	void findMin() {
		for(Map.Entry<int[], Integer> entry : inputs.entrySet()) {
			int expected = entry.getValue();
			int actual = solution.findMin(entry.getKey());
			assertEquals(expected, actual);
		}
	}

}
