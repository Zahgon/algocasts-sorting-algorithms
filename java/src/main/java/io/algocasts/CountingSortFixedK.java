package io.algocasts;

public class CountingSortFixedK {

    private int k;

    // 对于数组中元素 x，有 0 <= x <= k, k 是一个较小的数字。
    public CountingSortFixedK(int k) {
        this.k = k;
    }

    // indexes 最后存储的是排序后，相同数字在结果数组的开始位置，相同数字会依次向后（右）填充。
    // Time: O(n+k), Space: O(n+k)
    public void sortLeft2Right(int[] arr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // indexes 最后存储的是排序后，相同数字在结果数组的结束位置，相同数字会依次向前（左）填充。
    // Time: O(n+k), Space: O(n+k)
    public void sortRight2Left(int[] arr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
