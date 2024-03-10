import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        float km,mile;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter kilometer:");
        km=sc.nextFloat();
        mile=(float) (km/1.6);
        System.out.println("Mile:"+mile);
        sc.close();
    }
}
