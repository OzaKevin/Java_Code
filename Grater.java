import java.util.Scanner;

public class Grater {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        a=sc.nextInt();
        if (a>=18) {
            System.out.println("Age is valid.");
        }
        else{
            System.out.println("Age is not valid.");
        }
        sc.close();
    }
}
