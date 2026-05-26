package io.algocasts;

public class SelectionSort {

    private void swap(int[] arr, int i, int j) {
        if (i == j)
            return;
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // Time: O(n^2), Space: O(1)
    public void sort(int[] arr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Time: O(n^2), Space: O(1)
    public void sortFromEnd(int[] arr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
