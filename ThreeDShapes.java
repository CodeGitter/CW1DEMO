package mdx.ac.mt.model;
import java.io.Serializable;
public abstract class ThreeDShapes extends Shapes implements Serializable {
    double shapeVolume;
    double surfaceArea;
    public ThreeDShapes(char shapeIDParam) {
        super(shapeIDParam);
    }
    
 
    public void setVolume()
    {}
    
    public double getVolume()
    {
        return shapeVolume;  
    }
    
    //get surface area
    //make construc
}
