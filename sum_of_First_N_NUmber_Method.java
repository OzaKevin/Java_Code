/**
 * sum_of_First_N_NUmber_Method
 */
public class sum_of_First_N_NUmber_Method {

    public static void main(String[] args) {
        System.out.println(sum(15));
    }
    static int sum(int a){
        int val=0;
        for (int i = 0; i <=a; i++) {
            val=val+i;
            
        }
        return val;
    }

}