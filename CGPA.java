import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5,CGPA;
        float CGPAper;
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter mark of your 1st subject:");
        m1=sc.nextInt();
        System.err.println("Enter mark of your 2st subject:");
        m2=sc.nextInt();
        System.err.println("Enter mark of your 3st subject:");
        m3=sc.nextInt();
        System.err.println("Enter mark of your 4st subject:");
        m4=sc.nextInt();
        System.err.println("Enter mark of your 5st subject:");
        m5=sc.nextInt();
        CGPA=(m1+m2+m3+m4+m5)/5;
        CGPAper=(float) (9.5*(CGPA));
        System.out.println("Your CGPA is:"+CGPA);
        System.out.println("Your CGPA persentage is:"+CGPAper);
        sc.close();

    }
};
