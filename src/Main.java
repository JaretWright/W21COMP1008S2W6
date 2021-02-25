import java.time.LocalDate;
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

       //experimenting with the employee class
        Employee emp1 = new Employee("Fred","Flintstone", LocalDate.of(1985,12,30));
        HourlyEmployee emp2 = new HourlyEmployee("Betty","Rubble",LocalDate.of(1990,9,29),18);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
}
