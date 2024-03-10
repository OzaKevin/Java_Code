/**
 * sum_Of_Array_With_Float_Value
 */
public class sum_Of_Array_With_Float_Value {

    public static void main(String[] args) {
        float arr[]={1.2f,0.5f,4.1f,6.2f,5.6f},sum=0f;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}