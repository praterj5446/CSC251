
/**
 *
 * This class holds data about brick cost
 * 
 */
package BrickBlockProject;
public class Cost{
    private double length;
    private double width;
    private double height;
    private double doorsOnWall;
    
    public Cost(double len, double w, double h, double g)
    {
        length = len;
        width = w;
        height = h;
        doorsOnWall = g;
    }
        
    public void setLength(double len){
        length = len;
    }
    public void setWidth(double w){
        width = w;
    }
    public double setHeight(double h){
        height = h;
        return height;
    }
        
    public double getLength(){
        return length;
        
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    
    public double getArea(){
        return (width * height) - doorsOnWall;
    }
    public double getDoorsOnWall(double g){
        doorsOnWall = g;
        return doorsOnWall;
        
    }
}
