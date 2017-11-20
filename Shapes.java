package mdx.ac.mt.model;

import java.io.Serializable;

public abstract class Shapes implements Serializable 
{
    private char shapeID; //Shape input ID
    //R C T or A for ALL
    //S Y or A for ALL
    public Shapes(char shapeIDParam)
    {
        this.shapeID = shapeIDParam;
                
    }
}
