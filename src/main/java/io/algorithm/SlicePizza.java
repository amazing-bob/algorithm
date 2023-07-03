package io.algorithm;


public class SlicePizza {
    /*
    2 ≤ slice ≤ 10
    1 ≤ n ≤ 100

    slice	n	result
        7	10	2
        4	12	3
    * */

    public int slice(int slice, int n) {
        if (slice < 2 || slice > 10) {
            throw new IllegalArgumentException(String.format("Parameter 부적합 [slice]: %d", slice));
        }
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException(String.format("Parameter 부적합 [n]: %d", n));
        }
        return (int)Math.ceil((float)n / slice);
    }


}
