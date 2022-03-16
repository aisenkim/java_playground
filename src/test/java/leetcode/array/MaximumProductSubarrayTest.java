package leetcode.array;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductSubarrayTest {

   static MaximumProductSubarray mps;

    @BeforeAll
    static void setup() {
        mps = new MaximumProductSubarray();
    }

    @Test
    void maxProduct() {
        int[] nums = new int[]{2,3,-2,4};
        int expectedResult = 6;
        int actualResult = mps.maxProduct(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void maxProductWithOneNumber() {
        int[] nums = new int[]{2};
        int expectedResult = 2;
        int actualResult = mps.maxProduct(nums);
        assertEquals(expectedResult, actualResult);
    }
}