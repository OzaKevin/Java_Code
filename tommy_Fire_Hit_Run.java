class Tommy{
    public void fire(){
        System.out.println("Fire to the enemy");
    }
    public void hit(){
        System.out.println("Hiting to the enemy");
    }
    public void run(){
        System.out.println("Running form the enemy");
    }
}
/**
 * tommy_Fire_Hit_Run
 */
public class tommy_Fire_Hit_Run {

    public static void main(String[] args) {
        Tommy player1=new Tommy();
        player1.fire();
        player1.hit();
        player1.run();

    }
}