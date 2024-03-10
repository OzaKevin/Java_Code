import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Grade:");
        grade=sc.next().charAt(0);
        grade=(char) (grade+8);
        System.out.println("Adding 8 to grade:"+grade);
        grade=(char) (grade-8);
        System.out.println("Subtract 8 to grade:"+grade);
        sc.close();

    }
}
