package Heap;

public class binaryHeap {
    private int[] heapArray;

    //max size in heap
    private int capacity;

    private int cur_heap_size;

    public binaryHeap(int n) {
        capacity = n;
        heapArray = new int[capacity];
        cur_heap_size = 0;
    }

    // swapping
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private int parent(int key){
        return (key - 1) / 2;
    }
    private int left(int key){
        return 2 * key + 1;
    }
    private int right(int key){
        return 2 * key + 2;
    }
    public boolean insertKey(int key){
        if (cur_heap_size == capacity){
            return false;
        }
        int i = cur_heap_size;
        heapArray[i] = key;
        cur_heap_size ++;

        while (i != 0 && heapArray[i] < heapArray[parent(i)]){
            swap(heapArray, i, parent(i));
            i = parent(i);
        }
        return true;
    }
    public void decreaseKey(int key, int new_val) {
        heapArray[key] = new_val;

        while (key != 0 && heapArray[key] < heapArray[parent(key)]) {
            swap(heapArray, key, parent(key));
            key = parent(key);
        }
    }
    public int getMin() {
        return heapArray[0];
    }
    public int extractMin() {
        if (cur_heap_size <= 0) {
            return Integer.MAX_VALUE;
        }

        if (cur_heap_size == 1) {
            cur_heap_size--;
            return heapArray[0];
        }

        // Store the minimum value,
        // and remove it from heap
        int root = heapArray[0];

        heapArray[0] = heapArray[cur_heap_size - 1];
        cur_heap_size--;
        MinHeapify(0);

        return root;
    }

    // This function deletes key at the
    // given index. It first reduced value
    // to minus infinite, then calls extractMin()
    public void deleteKey(int key) {
        decreaseKey(key, Integer.MIN_VALUE);
        extractMin();
    }

    // A recursive method to heapify a subtree
    // with the root at given index
    // This method assumes that the subtrees
    // are already heapified
    private void MinHeapify(int key) {
        int l = left(key);
        int r = right(key);

        int smallest = key;
        if (l < cur_heap_size && heapArray[l] < heapArray[smallest]) {
            smallest = l;
        }
        if (r < cur_heap_size && heapArray[r] < heapArray[smallest]) {
            smallest = r;
        }

        if (smallest != key) {
            swap(heapArray, key, smallest);
            MinHeapify(smallest);
        }
    }

    // Increases value of given key to new_val.
    // It is assumed that new_val is greater
    // than heapArray[key].
    // Heapify from the given key
    public void increaseKey(int key, int new_val) {
        heapArray[key] = new_val;
        MinHeapify(key);
    }

    // Changes value on a key
    public void changeValueOnAKey(int key, int new_val) {
        if (heapArray[key] == new_val) {
            return;
        }
        if (heapArray[key] < new_val) {
            increaseKey(key, new_val);
        } else {
            decreaseKey(key, new_val);
        }
    }

}
