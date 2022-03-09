package twoSum;

import org.junit.Test;
import twoSum.TwoSumHash.*;
import twoSum.TwoSumHash;

import static org.junit.Assert.*;

public class TwoSumHashTest {

    @Test
    public void mainTest() {
    }

    @Test
    public void calculateTest(){
        int[] result = TwoSumHash.calculate(new int[]{1, 2, 3}, 3);
        assertArrayEquals(result,new int[]{0,1});
    }
}