package io.algocasts;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    private void insertionSort(List<Integer> arr) {
        if (arr == null || arr.size() == 0)
            return;
        for (int i = 1; i < arr.size(); ++i) {
            int cur = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > cur) {
                arr.set(j + 1, arr.get(j));
                --j;
            }
            arr.set(j + 1, cur);
        }
    }

    // 每个桶的大小，由于桶内使用插入排序，因此桶的大小使用一个较小值会比较高效。
    //
    // 一般来说，当处理的数组大小在 5-15 时，使用插入排序往往会比快排或归并更高效。
    // 因此在桶排序中，我们尽量让单个桶内的元素个数是在 5-15 个之间，这样可以用插入排序高效地完成桶内排序。
    // 参考链接：https://algs4.cs.princeton.edu/23quicksort/
    // 参考段落：
    // Cutoff to insertion sort. As with mergesort,
    // it pays to switch to insertion sort for tiny arrays.
    // The optimum value of the cutoff is system-dependent,
    // but any value between 5 and 15 is likely to work well in most situations.
    private int bucketSize;

    public BucketSort(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    // Time(avg): O(n+k), Time(worst): O(n^2), Space: O(n)
    public void sort(int[] arr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
