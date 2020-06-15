
import java.util.Arrays;

public class ShellSort {
    private int[] data;

    public static void main(String[] args){
        ShellSort algo = new ShellSort();
        int[] arr =  new int[] {3,1, 3,5,1,6,10,4,-1,3};
        algo.sort(arr, arr.length);
    }

    public int[] sort(int[] arr, int size) {
        int h = size;
        do {
            h = Math.max(h/3, 1); // make sure h=1 is tested
            for (int i=h; i<size; i++){
                for (int j=i; j>=h;j-=h) {
                    if (arr[j] < arr[j-h])
                        swap(arr, j, j-h);
                }
            }
        } while (h!=1);

        System.out.println("Sorted array: "+ Arrays.toString(arr));
        return arr;
    }

    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
