/**
 * sum_Of_Even_Using_For_Loop
 */
public class sum_Of_Even_Using_For_Loop {

    public static void main(String[] args) {
        int n=10,sum=0;
        for(int i=1;i<=n;i++){
            if (i%2==0) {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}