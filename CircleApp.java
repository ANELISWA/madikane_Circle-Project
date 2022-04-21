package circle;
import za.ac.wsu.s220596034.Circle;

/**
 *
 * @author A Madikane 220596034
 */
public class CircleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Circle object one
        Circle circle1 = new Circle();
        circle1.setRadius((float) 1.2);
        circle1.setX(11);
        circle1.setY(7);
        System.out.println("Circle 1");
        System.out.println(circle1.toString());
        System.out.println("Area: " + circle1.calculateArea() + "\n Circumference: " + 
             circle1.calculateCircumference() + "\nDiameter: " + circle1.calculateDiameter()+ "\n");

        //Circle object two 
        Circle circle2 = new Circle();
        circle2.setRadius((float) 7.2);
        circle2.setX(4);
        circle2.setY(6);
        System.out.println("Circle 2");
        System.out.println(circle2.toString());
        System.out.println("Area : " + circle2.calculateArea() + "\n Circumference: " + 
             circle2.calculateCircumference() + "\nDiameter: " + circle2.calculateDiameter()+ "\n");

        //Circle object three
        Circle circle3 = new Circle();
        circle3.setRadius((float) -2.5);
        circle3.setX(12);
        circle3.setY(8);
        System.out.println("Circle 3");
        System.out.println(circle3.toString());
        System.out.println("Area : " + circle3.calculateArea() + "\n Circumference: " + 
             circle3.calculateCircumference() + "\nDiameter: " + circle3.calculateDiameter()+ "\n");
         }
}
