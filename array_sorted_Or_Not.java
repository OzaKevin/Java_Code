/**
 * array_sorted_Or_Not
 */
public class array_sorted_Or_Not {

    public static void main(String[] args) {
        int arr[]={1,2,35,4,5};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                isSorted=false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array Is Sorted.");
        }
        else{
            System.out.println("Array Is Not Sorted.");
        }
    }
}