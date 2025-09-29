package Search;

public class binarySearch {
    int [] arr;
    int target;

    public binarySearch(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }
    public boolean binary(){
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi) {
            int mid = (lo + hi)/2;
            if(target < arr[mid]){
                hi =  mid -1;
            } else if (target > arr[mid]) {
                lo = mid +1;
            } else {
                return true;
            }
        }
        return false;
    }
    public int firstIndex(){
        int lo = 0;
        int hi = arr.length -1;
        int result = -1;

        while (lo <= hi){
            int mid = (lo + hi)/2;
            if (target < arr[mid]){
                hi = mid -1;
            } else if (target > arr[mid]) {
                lo = mid +1;
            }else{
                result = mid;
                hi = mid -1;
            }

        }
        return result;
    }
}
