class square{
    int a;
    public int area(){
        return a*a;
    }
    public int perimeter(){
        return 4*a;
    }
}
/**
 * find_Square_Using_Class
 */
public class find_Square_Using_Class {

    public static void main(String[] args) {
        square sq=new square();
        sq.a=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}