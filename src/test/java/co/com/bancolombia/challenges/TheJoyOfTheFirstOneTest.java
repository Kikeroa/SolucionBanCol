package co.com.bancolombia.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheJoyOfTheFirstOneTest {

    private TheJoyOfTheFirstOne joy = new TheJoyOfTheFirstOne();

    @Test
    void case0() {
        int[] array = {0, 1, -2, 3, -4, 5, -6, 7, -8, 9, 10, 11, 12};
        int numCount = 4;
        assertArrayEquals(new int[]{-8,-6,-4,-2}, joy.letsGoParty(array, numCount));
    }

    @Test
    void case1() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int numCount = 4;
        assertArrayEquals(new int[]{1,2,3,4}, joy.letsGoParty(array, numCount));
    }

    @Test
    void case2() {
        int[] array = {1,2,3,4,5,6,-7,-8,-9,-10};
        int numCount = 5;
        assertArrayEquals(new int[]{-10,-9,-8,-7, 1}, joy.letsGoParty(array, numCount));
    }
}