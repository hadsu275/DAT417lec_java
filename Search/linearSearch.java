package Search;

public class linearSearch{
    int [] arr;
    int target;

    public linearSearch(int[] arr, int target) {
        this.arr = arr;
        this.target = target;

    }
    public boolean search(){
        for(int i : arr){
            if (i == target){
                return true;
            }
        }
        return false;


    }
}
