/*
 * Jacob White
 * CSC-251-0001
 * 10/31/2019
 * This program uses multiple classes to get data about length,width,height,area
 * and volume
 */
package BrickBlockProject;
import java.util.Scanner; 
import java.text.DecimalFormat;
public class BrickBlockProject {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double length;
        double width;
        double height;
        double brickP = 8.15625;
        
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter the following measurements of the wall in ft: ");
        
        System.out.print("Length: ");
        length = k.nextDouble();
        
        System.out.print("Width: ");
        width = k.nextDouble();
        
        System.out.print("Height: ");
        height = k.nextDouble();
        
        Cube myCube =
                new Cube(length, width, height);
        
        System.out.println("Here are the Wall's properties.");
        
        System.out.println("Length: " + myCube.getLength()+" Ft.");
        System.out.println("Width: " + myCube.getWidth()+" Ft.");
        System.out.println("Height: " + myCube.getHeight()+" Ft.");
        System.out.println("Wall Area: " + myCube.getArea()+" Sq Ft.");
        System.out.println("Brick Amount: "+ (df.format(myCube.getBrickAmt())));
        System.out.println("Brick Cost: $"+ (df.format(myCube.getCost())));
    }
    
}
