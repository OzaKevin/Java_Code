/**
 * int_Available_In_Array
 */
public class int_Available_In_Array {

    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,};
        // int num=6;
        // boolean isInArray=false;
        // for(int element:arr){
        //     if (num==element) {
        //         isInArray=true;
        //         break;
        //     }
        // }
        // if (isInArray) {
        //     System.out.println("It is.");
        // }
        // else{
        //     System.out.println("Its not.");
        // }
        float []arr={25.6f,56.8f,78.9f,45.6f};
        float sum=0f;
        for (float f : arr) {
            sum=sum+f;
        }
        System.out.println("The Average Is:"+sum/arr.length);
    }
}