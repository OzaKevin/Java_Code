import java.util.Scanner;

/**
 * leap_Year
 */
public class leap_Year {

    public static void main(String[] args) {
        int year=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Born Year:");
        year=sc.nextInt();
        if (year%4==0) {
            System.out.println("You Are Born In Leap Year.");
        }
        else{
            System.out.println("You Are Not Born In Leap Year.");
        }
        sc.close();
    }
}