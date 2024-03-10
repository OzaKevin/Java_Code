import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Marks Of Maths:");
        m1=sc.nextByte();
        System.out.println("Enter Marks Of Hindi:");
        m2=sc.nextByte();
        System.out.println("Enter Marks Of Gujarati:");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("Your Overall Persentage Is:"+avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("Congratulation You Are Passed.");
        }
        else{
            System.out.println("Sorry,You Are fail,Try Again Next Time.");
        }
        sc.close();
        }
    }

