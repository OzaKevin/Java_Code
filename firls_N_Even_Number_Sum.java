import java.util.Scanner;

/**
 * firls_N_Even_Number_Sum
 */
public class firls_N_Even_Number_Sum {

    public static void main(String[] args) {
        int i,sum=0,num;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number.");
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            if (i%2==0) {
                sum=sum+i;
            }
        }
        System.out.println("Your Sum Of First "+num+" Number Is :"+sum);
        sc.close();
    }
}