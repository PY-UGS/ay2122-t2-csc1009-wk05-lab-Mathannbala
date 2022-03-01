package Lab5Question2;

public class Triangle extends Shape {

    public Triangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area = getDim1() * getDim2() ;
        return area/2;

    }

}
