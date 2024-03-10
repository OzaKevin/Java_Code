
class Employee{
    int id;
    int salary;
    String name;
     void printDetail(){
        System.out.println("My id is"+id);
        System.out.println("And My Nmae Is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

/**
 * creating_Our_Own_Class
 */
public class creating_Our_Own_Class {

    public static void main(String[] args) {
        System.out.println("This is cutom class that i make.");
        Employee kevin=new Employee();
        Employee shubham=new Employee();

        //Setting attributes for kevin
        kevin.id=19;
        kevin.salary=35;
        kevin.name="Kevin";

        //Setting attributes for shubham
        shubham.id=20;
        shubham.salary=50;
        shubham.name="Shubham";

        //Printing the attributes
        kevin.printDetail();
        shubham.printDetail();
         int salary=shubham.getSalary();
         System.out.println("My salary is "+salary+" thousand");

    }
}