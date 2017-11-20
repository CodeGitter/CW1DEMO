package mdx.ac.mt.model;
import java.io.Serializable;
public class Rectangle extends TwoDShapes implements Serializable {
    private double height;
    private double width;
    
    public Rectangle(double heightInput, double widthInput)
    {
        super('R');//ID
        //constructor takes params from user input in client
        noOfSides = 4;//overridden 
        //sets area of shapes depending on input passed to constructor
        //when instance of Rectangle is created
        setArea(heightInput, widthInput);
        this.shapeArea = getArea();
    }
    
    //overriding setArea 
    public void setArea(double height, double width) 
    { //sets area based on params passed by constructor
        double tempArea = (height * width);
        
        this.shapeArea = tempArea;
    }
    
    public double getArea()
    {
        return this.shapeArea;
    }
}
