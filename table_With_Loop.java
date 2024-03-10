import java.util.Scanner;

/**
 * table_With_Loop
 */
public class table_With_Loop {
    
    public static void main(String[] args) {
        int table;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A Number Which You Want To Print A Table.");
        table=sc.nextInt();
        System.out.println("The Table of "+table+" Is:" );
        for(int i=10;i!=0;i--)
        {
               System.out.println(table+"*"+i+"="+table*i);
            }
            sc.close();
    }
}