package javaclass;

public class Circle {

    private int x; //instant var
    private int y;
    private int radius;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;  //To this anaferetai sto antikeimeno pou kalese th methodo, px circle1
        } else {
            System.out.println("number " + x + " is negative.");
        }
    }

    public int gety() {
        return y;
    }

    public void sety(int number) {
        if (number >= 0) {
            y = number; //arithmos local var
        } else {
            System.out.println("number " + number + " is negative.");
        }

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int rad) {
        if (rad >= 0) {
            radius = rad;
        }
    }

    //This is a method to set coordinates of the circle - sets x and y
    public void setDetails(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //This is a method to set coordinates of the circle - sets x, y and r
    //Overloading = 2 methodoi me diaforetika orismata (ligotera h perissotera)
    /**
     * 
     * @param x will go to x
     * @param y will go to y
     * @param r will go to radius
     */
    
    public void setDetails(int x, int y, int r) {
        setDetails(x, y);
        this.radius = r;
    }

    public double getPerimeter() {
        double result = 2 * Math.PI * radius;
        return result;
    }

    public double getArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
    
    //accepted
    public void hello(String name, int age){
        
    }
    public void hello(int age, String name){
        
    }
}
