
/**
 *
 * This class holds data about a rectangle
 * 
 */
package BrickBlockProject;
public class Rectangle {
    private double length;
    private double width;
    private double height;
    
    public Rectangle(double len, double w, double h)
    {
        length = len;
        width = w;
        height = h;
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
        return width * height;
    }
}
