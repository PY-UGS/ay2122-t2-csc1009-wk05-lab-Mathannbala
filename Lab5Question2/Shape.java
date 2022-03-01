package Lab5Question2;

public abstract class Shape {
    private int dim1;
    private int dim2;
    private double PI = 3.14;

    public Shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public Shape(int dim1, int dim2, double PI){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = PI;

    }

    public int getDim1() {
        return this.dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return this.dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    public double getPI() {
        return this.PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public abstract double area();

}
