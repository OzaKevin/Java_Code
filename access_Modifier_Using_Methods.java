class Darshan{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
/**
 * access_Modifier_Using_Methods
 */
public class access_Modifier_Using_Methods {

    public static void main(String[] args) {
        Darshan kk=new Darshan();
        //kk.id=5; --> Generate error because of access modifier
        //kk.name="Kevin Oza";--> Generate error because of access modifier
        kk.setName("Kevin Oza Sanjay Kumar");
        System.out.println(kk.getName());
        kk.setId(6);
        System.out.println(kk.getId());
        
    }
}