package twoSum;//package
import org.junit.Test;
import twoSum.DubleSum;

import static org.junit.Assert.*;
//import static twoSum.DubleSum.resultIndex;

public class DubleSumTest {

    @Test
    public void main() {
    }

    @Test
    public void resultTest(){
        assertArrayEquals(new int[]{0,1}, DubleSum.resultIndex(new int[]{1,2,3}, 3));
        //assertEquals([1],[1]);
    }
}