package mdx.ac.mt.model;
import java.io.Serializable;
public class Sphere extends ThreeDShapes implements Serializable {
    final private char shapeID = 'S';//ID
    final private double Pi = 3.14;
    private double radius;
    
    public Sphere(double radiusInput)
    {
        super('S');//ID
        //constructor takes params from user input in client
        
        //sets area of shapes depending on input passed to constructor
        //when instance of this class is created
        setVolume(radiusInput);
        this.shapeVolume = getVolume();
    }
    
    //overriding setArea 
    public void setVolume(double radius) 
    { //sets area based on params passed by constructor
        double tempVolume = ((4/3)*(Pi)*(radius*radius*radius));//formula for vol of sph
        
        this.shapeVolume = tempVolume;
        
    }
    
    public double getVolume()
    {
        return this.shapeVolume;
    }
}
