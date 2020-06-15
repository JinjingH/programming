public class QuickSort {
    public double[] arr;
    public int size;
    public QuickSort(double[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }
    
public void quickSort(double[] arr, int left, int right) {
    // quick sort
    if (left < right) {
        int partitionIndex = partition(arr, left, right);
            partition(arr, left, partitionIndex - 1);
            partition(arr, partitionIndex + 1, right);
        }
    }

private int partition(double[] arr, int left, int right) {
    if (left<right) {
        double pivot = arr[left];
        int low = left; // low point to the value <= pivot
        for(int i = low+1; i<=right; i++) {
            if (arr[i] <= pivot) {
                low++;
                swap(low, i);
            }
        }
        swap(low, left);
        return low;
    }
    else {
        return left;
    }
}
}

private void swap(double[] arr, int i, int j) {
    double tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}
