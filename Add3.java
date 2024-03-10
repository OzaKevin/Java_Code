import java.util.*;
public class Add3{
public static void main(String[] args) {
    int x,y,z,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First number:");
    x=sc.nextInt();
     System.out.println("Enter Second number:");
    y=sc.nextInt();
     System.out.println("Enter third number:");
    z=sc.nextInt();
    sum=x+y+z;
    System.out.println("Some of three number is:"+sum);
    sc.close();
}
};