class Rectangle{
    int length,width,area,perimeter;
    public int areaOfRectangle(){
        area=length*width;
        return area;
    }
    public int perimeterOfRectangle(){
        perimeter=2*(length+width);
        return perimeter;
    }
}
/**
 * find_Rectangle_Area_Uing_Class
 */
public class find_Rectangle_Area_Uing_Class {

    public static void main(String[] args) {
        Rectangle rq=new Rectangle();
        rq.length=2;
        rq.width=3;
        System.out.println(rq.areaOfRectangle());
        System.out.println(rq.perimeterOfRectangle());
    }
}