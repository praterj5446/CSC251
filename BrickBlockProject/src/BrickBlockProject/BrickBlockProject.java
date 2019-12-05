/*
 *
 *
 *
 */
package BrickBlockProject;
import java.util.Scanner; 
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class BrickBlockProject {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        double brickP = 8.15625;
        
        Scanner k = new Scanner(System.in);
        
        welcome();
        JOptionPane.showMessageDialog(null, "Enter the measurements of the wall in feet. ");
        double length = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Length: "));
        
        double width = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Width: "));
        
        double height = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Height: "));
        
        
        BrickAmt myCube =
                new BrickAmt(length, width, height);
        
        
                JOptionPane.showMessageDialog(null, "Here are the Wall's Properties. "+
                "\n\nLength: "+ myCube.getLength()
                        +" Ft."+"\nWidth: "+ myCube.getWidth()
                +" Ft."+"\nHeight: "+ myCube.getHeight()
                        +" Ft."+"\nWall Area: "+ myCube.getArea()
                +" Sq Ft."+"\nBrick Amount: "+(df.format(myCube.getBrickAmt()))+
                        "\nBrick Cost: $"+(df.format(myCube.getCost())));
                goodbye();
        
        System.out.println("Here are the Wall's properties.");
        
        System.out.println("Length: " + myCube.getLength()+" Ft.");
        System.out.println("Width: " + myCube.getWidth()+" Ft.");
        System.out.println("Height: " + myCube.getHeight()+" Ft.");
        System.out.println("Wall Area: " + myCube.getArea()+" Sq Ft.");
        System.out.println("Brick Amount: "+ (df.format(myCube.getBrickAmt())));
        System.out.println("Brick Cost: $"+ (df.format(myCube.getCost())));
         

    }
    public static void welcome(){
        JOptionPane.showMessageDialog(null, "Welcome to the Brick Block Program! ");
    }
    public static void goodbye(){
        JOptionPane.showMessageDialog(null, "Thank you for using the program. ");
    }
    
}
