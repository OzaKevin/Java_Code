/**
 * pattern_Using_Method
 */
public class pattern_Using_Method {

    public static void main(String[] args) {
        pat();
    }
    static void pat(){
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        } 
    }
}