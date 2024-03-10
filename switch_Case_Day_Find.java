import java.util.Scanner;

/**
 * switch_Case_Day_Find
 */
public class switch_Case_Day_Find {

    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number:");
        a=sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Your Day Is Monday.");
                break;
            case 2:
                System.out.println("Your Day Is Tuesday.");
                break;
            case 3:
                System.out.println("Your Day Is Wednesday.");
                break;
            case 4:
                System.out.println("Your Day Is Thursday.");
                break;
            case 5:
                System.out.println("Your Day Is Friday.");
                break;
            case 6:
                System.out.println("Your Day Is Saturday.");
                break;
            case 7:
                System.out.println("Your Day Is Sunday.");
                break;
        
            default:
            System.out.println("Invalid Input.");
                break;
        }
        sc.close();
    }
}