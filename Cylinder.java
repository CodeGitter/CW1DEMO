package mdx.ac.mt.model;
import java.io.Serializable;
public class Cylinder extends ThreeDShapes implements Serializable{
    final private char shapeID = 'Y';//ID
    final private double Pi = 3.14;
    private double radius;
    private double height;
    
    public Cylinder(double radiusInput, double heightInput)
    {
        super('Y');//ID
        //constructor takes params from user input in client
        
        //sets area of shapes depending on input passed to constructor
        //when instance of this class is created
        setVolume(radiusInput, heightInput);
        this.shapeVolume = getVolume();
    }
    
    //overriding setArea  //setVolume should be called when there's user input
    public void setVolume(double radius, double height) 
    { //sets area based on params passed by constructor
        double tempVolume = ((Pi)*(radius*radius)*(height));//formula for vol of sph
        
        this.shapeVolume = tempVolume;
    }
    
    public double getVolume()
    {
        return this.shapeVolume;
    }
}
