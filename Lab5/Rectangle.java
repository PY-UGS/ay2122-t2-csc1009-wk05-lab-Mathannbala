package Lab5;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height, String colour, boolean filled){
        super(colour, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
       double area = height * width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (height*2) + (width*2);
        return perimeter;
    }

}
