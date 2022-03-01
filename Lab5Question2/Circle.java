package Lab5Question2;

public class Circle extends Shape {

    public Circle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area = getPI() * getDim1() * getDim2();
        return area;
    }
}
