package Lab5Question2;

public class Ellipse extends Shape {

    public Ellipse(int dim1, int dim2){
        super(dim1, dim2);
    }

    @Override
    public double area() {
        double area = getPI() * getDim1() *getDim2();
        return area;
    }
}
