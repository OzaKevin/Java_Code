import java.util.Arrays;

/**
 * Marge_two_Array
 */
public class Marge_two_Array {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(Arrays.toString(merge_array(arr1, arr2)));
    }

    static int[] merge_array(int[] arr1, int[] arr2){
        int[] new_Arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            new_Arr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            new_Arr[arr1.length + i] = arr2[i];
        }
        return new_Arr;
    }
}