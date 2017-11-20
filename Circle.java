package mdx.ac.mt.model;
import java.io.Serializable;
public class Circle extends TwoDShapes implements Serializable {
    final private double Pi = 3.14;
    private double radius;
    private double diameter;
    private double perimeter;
    
    public Circle(double radiusInput)
    {
        super('C'); //ID
        //constructor takes params from user input in client
        //sets area of shapes depending on input passed to constructor
        //when instance of this class is created
        setArea(radiusInput);
        setPerimeter(radiusInput);
        this.shapeArea = getArea();
        this.perimeter = getPerimeter();
        System.out.println("Area: "+ this.shapeArea);
        System.out.println("Perimeter: "+ this.perimeter);
    }
    
    //overriding setArea 
    public void setArea(double radius) 
    { //sets area based on params passed by constructor
        double tempArea = (Pi * (radius*radius));//formula for area of circle
        
        this.shapeArea = tempArea;
    }
    
    public double getArea()
    {
        return this.shapeArea;
    }
    
    public void setPerimeter(double radius)
    {
        double tempPerimeter = (2*Pi*radius);
        
        this.perimeter = tempPerimeter;
    }
    public double getPerimeter()
    {
        return this.perimeter;
    }
}
