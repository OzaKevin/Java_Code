/**
 * sum_Of_Table
 */
public class sum_Of_Table {

    public static void main(String[] args) {
        int table=8,sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(table+"*"+i+"="+table*i);
            sum=sum+table*i;
        }
        System.out.println("The Sum Of Table 8 Is:"+sum);
    }
}