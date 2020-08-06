package com.solutions;

/**
 * @author majorMobilych, https://github.com/majorMobilych;
 */
public final class Solutions {

    private Solutions() {
        throw new AssertionError("Non-instantiating class");
    }

    /* I use "<>", to indicate, that param in brackets is given */

    public static String solution(int number, int amountOfTerms) {

        /* The lowest odd number is 1, then goes 3, 5, 7 e.t.c.,
         * so, the least sum of <amountOfTerms> different odd integers is:
         * 1 + 3 + 5 + ... + (2 * <amountOfTerms> - 1) = (<amountOfTerms>)^2,
         * thus, <number> can't be less then (<amountOfTerms>)^2 */
        if (number < amountOfTerms * amountOfTerms) {
            return "NO";
        }

        /* If we have odd number of odd terms summing up, we can't get an even number, as well as
         * if we have even number of odd terms summing up, we can't get an odd number */
        if (((number % 2 == 0) && (amountOfTerms % 2 != 0)) || ((number % 2 != 0) && (amountOfTerms % 2 == 0))) {
            return "NO";
        }

        /*  Now, we have:
         * 1.<number> >= (<amountOfTerms>)^2, and:
         * 2.<number> and <amountOfNumbers> have the same parity;
         *   If <number> and <amountOfTerms> are both odd, or both even,
         * that also implies that <number> (<amountOfTerms>)^2 have same parity
         *   Consider the sum:
         * 1 + 3 + 5 + ... + (2 * <amountOfTerms> - 1),
         * but instead of last term, use ((2 * (<amountOfTerms>) - 1) + (<number>) - (<amountOfTerms>)^2):
         *   Explanation:
         * (<number>) - (<amountOfTerms>)^2 is an even integer, as they have same parity,
         * so, ((2 * (<amountOfTerms>) - 1) + (<number>) - (<amountOfTerms>)^2) is odd, (odd + even = odd);
         *   Conclude:
         * 1.Numbers {1, 3, 5, 7, ...,((2 * (<amountOfTerms>) - 1) + (<number>) - (<amountOfTerms>)^2)} are different;
         * 2.1 + 3 + 5 + 7+ ... + ((2 * (<amountOfTerms>) - 1) + (<number>) - (<amountOfTerms>)^2) =
         *   = ((<amountOfTerms>)^2 + (<number>) - (<amountOfTerms>)^2) = number;
         *   So, we get desired result.*/
        return "YES";
    }
}
