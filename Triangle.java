package mdx.ac.mt.model;
import java.io.Serializable;
public class Triangle extends TwoDShapes implements Serializable {
    final private char shapeID = 'T';//ID
    
    private double shortLeg;
    private double longLeg;
    
    public Triangle(double shortLegInput, double longLegInput)
    {
        super('T');//ID
        //constructor takes params from user input in client
        
        //sets area of shapes depending on input passed to constructor
        //when instance of this class is created
        setArea(shortLegInput, longLegInput);
        this.shapeArea = getArea();
    }
    
    //overriding setArea 
    public void setArea(double shortLeg, double longLeg) 
    { //sets area based on params passed by constructor
        double tempArea = ((shortLeg*longLeg)/2);//formula for area of tri
        
        this.shapeArea = tempArea;
    }
    
    public double getArea()
    {
        return this.shapeArea;
    }
}
