/**
 * multiplication_Using_Method
 */
public class multiplication_Using_Method {

    public static void main(String[] args) {
        table(5);
    }
    static void table(int number){
        int val=1;
        for (int i = 1; i <=10; i++) {
            val=number*i;
            System.out.format("5*%d=%d\n",i,number*i);
        }
    }
}