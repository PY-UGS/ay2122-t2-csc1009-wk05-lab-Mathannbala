package Lab5;

import java.util.Date;

public class GeometricObject {

    private String colour = "white";
    private boolean filled = false;
    private Date dateCreated;

    public GeometricObject(){
        this.colour = "white";
        this.filled = false;
    }

    public GeometricObject(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        long millis = System.currentTimeMillis();
        dateCreated = new Date(millis);
        return this.dateCreated;

    }

    public String toString(){
        return "Created on " + this.getDateCreated() + "\nColour: " + this.getColour() + " and filled: " + this.isFilled();
    }
}
