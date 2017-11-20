package mdx.ac.mt.model;
import java.io.Serializable;
public abstract class TwoDShapes extends Shapes implements Serializable {
    double shapeArea;
    int noOfSides;

    public TwoDShapes(char shapeIDParam) {
        super(shapeIDParam);
    }
    
    public void setArea()
    {}
    
    public double getArea()
    {
        return shapeArea;
    }
    
    //get param
    //make construc
}
