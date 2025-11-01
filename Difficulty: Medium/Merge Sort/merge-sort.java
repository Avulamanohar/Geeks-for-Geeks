class Solution {

    void mergeSort(int arr[], int l, int r) {
        int[] buffer = new int[arr.length];  // allocate once
        mergeSort(arr, l, r, buffer);
    }

    void mergeSort(int arr[], int l, int r, int[] buffer) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid, buffer);
            mergeSort(arr, mid + 1, r, buffer);
            merge(arr, l, mid, r, buffer);
        }
    }

    void merge(int arr[], int l, int mid, int r, int[] buffer) {
        int i = l, j = mid + 1, k = l;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                buffer[k++] = arr[i++];
            } else {
                buffer[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            buffer[k++] = arr[i++];
        }
        while (j <= r) {
            buffer[k++] = arr[j++];
        }
        for (int x = l; x <= r; x++) {
            arr[x] = buffer[x];
        }
    }
}
