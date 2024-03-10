/**
 * reverse_Array
 */
public class reverse_Array {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,10};
        int l=arr.length;
        int temp;
        int n=Math.floorDiv(l, 2);
        for(int i=0;i<n;i++)
        {
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]+" ");
        }
    }
}