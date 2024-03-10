/**
 * find_Maximum_In_Array
 */
public class find_Maximum_In_Array {

    public static void main(String[] args) {
        int arr[]={-12,45,85,35,-11,98,45};
        int max=0,min=arr[0];
         for(int element:arr)
         {
            if (element>max) {
             max=element;
            }
         }
         System.out.println("Maximun Number In Array Is:"+max);
        for(int i=0;i<arr.length;i++)
        {
            if (min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.println("Minimum Number In Array Is:"+min);
    }
}