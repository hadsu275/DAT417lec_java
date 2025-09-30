import Heap.binaryHeap;
import Search.binarySearch;
import Search.linearSearch;
import Sort.insertionSort;
import Sort.selectionSort;

public static void main(String[] args) {
    /*
    It is for Search file Test *****************************************************


    int[] numbers = {1, 2, 3, 4, 5};
    int [] n = {2,2,2,2,2,2,2,2};
    linearSearch ls = new linearSearch(numbers, 3);
    linearSearch ls1 = new linearSearch(numbers, 6);

    System.out.println(ls.search());
    System.out.println(ls1.search());// true
    binarySearch lb = new binarySearch(numbers, 3);
    System.out.println(lb.binary());

    binarySearch lb1 = new binarySearch(numbers, 12);
    System.out.println(lb1.binary());
    binarySearch l = new binarySearch(n, 2);
    System.out.println(l.firstIndex());

     */

    // it is fot sort test ******************************************************************

    int arr[] = { 12, 11, 13, 5, 6 };
    insertionSort ins = new insertionSort(arr);
    //ins.insert();
    //ins.print(arr);
    selectionSort sel = new selectionSort(arr);
    sel.select();
    sel.print(arr);






 /*


    binaryHeap h = new binaryHeap(11);
    h.insertKey(3);
    h.insertKey(2);
    h.deleteKey(1);
    h.insertKey(15);
    h.insertKey(5);
    h.insertKey(4);
    h.insertKey(45);
    System.out.print(h.extractMin() + " ");
    System.out.print(h.getMin() + " ");

    h.decreaseKey(2, 1);
    System.out.print(h.getMin());

  */
    
    // stack and queues  *********************************************************************************************************** 
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    System.out.println(s.isEmpty()); // false
    System.out.println(s);           // [1, 2, 3, 4]
    System.out.println(s.pop());     // 4
    System.out.println(s);           // [1, 2, 3]
    System.out.println(s.size());// 3
    System.out.println(s.peek());    // 3

}
