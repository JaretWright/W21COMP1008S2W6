import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<TwoDimensionalShape> arrayList = new ArrayList();
       arrayList.add(new Rectangle(10,20));
       arrayList.add(new Rectangle(20,30));
       arrayList.add(new Circle(10));
       arrayList.add(new Circle(30));

       //Loop over the array list and display the toString()
       //with the area
       for (TwoDimensionalShape shape : arrayList)
           System.out.printf("%s with area: %.1f%n",shape.toString()
                                                 ,shape.getArea());
    }
}
