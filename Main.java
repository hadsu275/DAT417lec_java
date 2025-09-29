import Search.binarySearch;
import Search.linearSearch;

public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int [] n = {2,2,2,2,2,2,2,2};
    linearSearch ls = new linearSearch(numbers, 3);
    linearSearch ls1 = new linearSearch(numbers, 6);

    //System.out.println(ls.search());
    //System.out.println(ls1.search());// true
    binarySearch lb = new binarySearch(numbers, 3);
    System.out.println(lb.binary());

    binarySearch lb1 = new binarySearch(numbers, 12);
    System.out.println(lb1.binary());
    binarySearch l = new binarySearch(n, 2);
    System.out.println(l.firstIndex());

}
