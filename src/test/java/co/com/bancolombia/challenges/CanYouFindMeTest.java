package co.com.bancolombia.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanYouFindMeTest {

    private CanYouFindMe canYouFindMe = new CanYouFindMe();

    @Test
    void case0() {
        int[] array = {0, 1, -2, 3, -4, 5, -6, 7, -8, 9, 10, 11, 12};
        int numCount = 4;
        assertArrayEquals(new int[]{2,4,6,8}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case1() {
        int[] array = {1,0,2,-3,-4,5};
        int numCount = 4;
        assertArrayEquals(new int[]{3,4,6,7}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case2() {
        int[] array = {-1,0,2,-3,-4,-5};
        int numCount = 5;
        assertArrayEquals(new int[]{1,3,4,5,6}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case3() {
        int[] array = {-1,-1,2,2,2,-4};
        int numCount = 4;
        assertArrayEquals(new int[]{1,3,4,5}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case4() {
        int[] array = {-2, -45, 3, 5, 12, 11, 2, 6, 10, 9, -5, -1, -55};
        int numCount = 4;
        assertArrayEquals(new int[]{1,4,7,8}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case5() {
        int[] array = {0};
        int numCount = 4;
        assertArrayEquals(new int[]{1,2,3,4}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case6() {
        int[] array = {0,1,2,3,4,5};
        int numCount = 4;
        assertArrayEquals(new int[]{6,7,8,9}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case7() {
        int[] array = {0, 1};
        int numCount = 3;
        assertArrayEquals(new int[]{2,3,4}, canYouFindMe.lostAndFound(array, numCount));
    }

    @Test
    void case8() {
        int[] array = {2,2,2,2,2,2,2,2};
        int numCount = 4;
        assertArrayEquals(new int[]{1,3,4,5}, canYouFindMe.lostAndFound(array, numCount));
    }
}