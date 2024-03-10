class cellphone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void callFriend(){
        System.out.println("calling Friend");
    }
}
/**
 * create_A_Class_Of_Cellphone
 */
public class create_A_Class_Of_Cellphone {

    public static void main(String[] args) {
        cellphone realme=new cellphone();
        realme.callFriend();
        realme.ring();
        realme.vibrate();
    }
}