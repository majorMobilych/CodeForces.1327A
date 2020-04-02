package com.test;

import com.solutions.SolutionsInterface;
import com.solutions.SolutionsInterfaceImpl;

import org.junit.Assert;
import org.junit.Test;

public class RunTests {
    private static final SolutionsInterface solver = new SolutionsInterfaceImpl();

    @Test
    public void test() {
        /* Number 1 cant't be expressed sum of 10 odd integers */
        Assert.assertEquals("NO", solver.Solution(1, 10));
        /* Summing up 10 odd numbers gives an even number; 101 is odd*/
        Assert.assertEquals("NO", solver.Solution(101, 10));
        /* Summing up 11 odd numbers gives an odd number; 100 is odd */
        Assert.assertEquals("NO", solver.Solution(100, 11));

        /* 16 = 1 + 3 + 5 + 7 */
        Assert.assertEquals("YES", solver.Solution(16, 4));
        /* 18 = 1 + 3 + 5 + 9 */
        Assert.assertEquals("YES", solver.Solution(18, 4));
        /* 100 = 1 + 3 + 5 + 7 + 9 + 75 */
        Assert.assertEquals("YES", solver.Solution(100, 6));

        /* 11 = 1 + 3 + 7 */
        Assert.assertEquals("YES", solver.Solution(11, 3));
        /* 19 = 1 + 3 + 15 */
        Assert.assertEquals("YES", solver.Solution(19, 3));
        /* 51 = 1 + 3 + 5 + 7 + 9 + 13 */
        Assert.assertEquals("YES", solver.Solution(51, 7));
    }
}
