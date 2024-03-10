/**
 * factorial_Using_Method
 */
public class factorial_Using_Method {

    public static void main(String[] args) {
        int number=5;
        System.out.println(fact(number));
    }
static int fact(int num){
    int facto=1;
    for (int i = 1; i <=num; i++) {
        facto=facto*i;
    }
    return facto;
}
}