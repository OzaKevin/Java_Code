import java.util.Scanner;

public class Expression2 {
    public static void main(String[] args) {
        float v,u,result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of v:");
        v=sc.nextFloat();
        System.out.println("Enter value of u:");
        u=sc.nextFloat();
        result=((v*v)-(u*u))/(295);
        System.out.println("Result is:"+result);
        sc.close();
    }
}
