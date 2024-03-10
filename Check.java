import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        if (sc.hasNextInt()) {
            System.out.println("Valid integer.");
            
        }
        else{
            System.out.println("Invalid integer.");
        }
        sc.close();
    }
}
