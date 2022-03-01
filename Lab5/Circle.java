package Lab5;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled){
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
}
    public double getDiameter(){
        double diameter = radius + radius;
        return diameter;
    }

    public void printCircle(){
        System.out.println("The radius of the circle is: " + getRadius());
        System.out.println("The Area of the circle is:  " + getArea());
        System.out.println("The perimeter of the circle is:  " + getPerimeter());
        System.out.println("The diameter of the circle is " + getDiameter());

}

}