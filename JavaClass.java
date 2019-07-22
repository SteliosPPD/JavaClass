package javaclass;

public class JavaClass {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        //final int a = 10;    //ayth h timh den allazei !
        //circle1.x = 10;
        circle1.setX(-5);
        circle1.sety(5);
        circle1.setRadius(3);

        System.out.println(circle1.getX());
        System.out.println(circle1.gety());
        System.out.println(circle1.getRadius());
        double tempPerimeter = circle1.getPerimeter();
        System.out.println("Perimeter of circle1 is: " + tempPerimeter);
        System.out.println("Area of circle1 is: " + circle1.getArea());

        System.out.println(circle2.getX());
        System.out.println(circle2.gety());
        System.out.println(circle2.getRadius());
        System.out.println("Perimeter of circle2 is: " + circle2.getPerimeter());
        System.out.println("Area of circle2 is: " + circle2.getArea());
        
        
        circle1.setDetails(5, 4, 2);
        circle2.setDetails(2, 44, 3);
        Circle[] array = {circle1, circle2};
        for (int i = 0; i < 2; i++) {
            System.out.println(array[i].getX());
            System.out.println(array[i].gety());
            System.out.println(array[i].getRadius());
        }
    }
}