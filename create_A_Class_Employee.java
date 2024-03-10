class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public  void settingName(String k){
        name = k;
        
    }
    public String gettingName(){
        return name;
    }
};

/**
 * create_A_Class_Employee
 */
public class create_A_Class_Employee {

    public static void main(String[] args) {
        Employee1 kkdhx=new Employee1();
        kkdhx.settingName("oza Kevin Sanjaykumar");
        System.out.println(kkdhx.gettingName());
        kkdhx.salary=256;
        System.out.println(kkdhx.getSalary());
    }
}