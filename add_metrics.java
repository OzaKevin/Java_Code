/**
 * add_metrics
 */
public class add_metrics {

    public static void main(String[] args) {
        int mat1 [][]={{1,2,3},{4,5,6}};
        int mat2 [][]={{7,8,9},{10,11,12}};
        int res[][]={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++)//rows number of time
        {
            for(int j=0;j<mat1[i].length;j++)//column number of times
            {
                System.out.print("Setting value for i= "+i+" and j=  "+j+"\n");
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("The Sum Of 2Metrics Is Below.");
        for(int i=0;i<mat1.length;i++)//rows number of time
        {
            for(int j=0;j<mat1[i].length;j++)//column number of times
            {
                System.out.print(res[i][j]+" ");
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println(" ");
        }
        
    }
}