import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your name?");
        name=sc.nextLine();
        System.out.println("Hello "+name+"! Good Morning");
        System.out.println("How are you?");
        sc.close();
    }
}
