import java.util.Scanner;

/**
 * type_Of_Website
 */
public class type_Of_Website {

    public static void main(String[] args) {
        String a=""; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Url:");
        a=sc.nextLine();
        
        //int res =  a.indexOf(".");
       // System.out.println(res);
        if (a.endsWith(".org")) {
            System.out.println("This Is Organization Website.");
        }
        else if (a.endsWith(".com")) {
            System.out.println("This Is Commercial Website.");
        }
        else if (a.endsWith(".in")) {
            System.out.println("This is Indian Website.");
        }
        else{
            System.out.println("I don't Know.");
        }
        sc.close();
    }
}