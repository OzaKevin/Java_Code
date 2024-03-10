/**
 * factorial_Using_Loop
 */
public class factorial_Using_Loop {

    public static void main(String[] args) {
        int fact=5;
        int ans =1;
        for(int i=1;i<=fact;i++)
        {
            ans=i*ans;
        }
        System.out.println(ans);
    }
}