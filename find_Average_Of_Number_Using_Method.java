/**
 * find_Average_Of_Number_Using_Method
 */
public class find_Average_Of_Number_Using_Method {

    public static void main(String[] args) {
        System.out.println(avarage());
    }
    static int avarage(){
       int avg,sum=0;
       int arr[]={1,52,23,94,5};
       for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
       }
       avg=sum/arr.length;
        return avg;
    }
}