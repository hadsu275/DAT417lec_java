package Sort;

import java.util.List;

public class insertionSort {
    int [] arr;

    public insertionSort(int[] arr) {
        this.arr = arr;
    }
    public void insert(){

        for (int i = 1; i <= arr.length -1; i++){
            int next = arr[i];
            int pos = i;
            while (pos > 0 && arr[pos-1] > next){
                arr[pos] = arr[pos-1];
                pos --;

            }
            arr[pos] = next;

        }
    }
    public void print(int[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
