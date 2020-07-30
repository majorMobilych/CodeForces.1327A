package com;

import org.junit.Assert;
import org.junit.Test;

import static com.solutions.Solutions.solution;

public class Tests {

    @Test
    public void testNoCaseOfSmallNumberAngAndLotsOfTerms() {
        /* Number 1 cant't be expressed sum of 10 odd integers */
        Assert.assertEquals("NO", solution(1, 10));
    }

    @Test
    public void testNoCaseParityIssues() {
        /* Summing up 10 odd numbers gives an even number; 101 is odd*/
        Assert.assertEquals("NO", solution(101, 10));
        /* Summing up 11 odd numbers gives an odd number; 100 is odd */
        Assert.assertEquals("NO", solution(100, 11));
    }

    @Test
    public void testYesCaseEven() {
        /* 16 = 1 + 3 + 5 + 7 */
        Assert.assertEquals("YES", solution(16, 4));
        /* 18 = 1 + 3 + 5 + 9 */
        Assert.assertEquals("YES", solution(18, 4));
        /* 100 = 1 + 3 + 5 + 7 + 9 + 75 */
        Assert.assertEquals("YES", solution(100, 6));
    }

    @Test
    public void testYesCaseOdd() {
        /* 11 = 1 + 3 + 7 */
        Assert.assertEquals("YES", solution(11, 3));
        /* 19 = 1 + 3 + 15 */
        Assert.assertEquals("YES", solution(19, 3));
        /* 51 = 1 + 3 + 5 + 7 + 9 + 13 */
        Assert.assertEquals("YES", solution(51, 7));
    }
}
