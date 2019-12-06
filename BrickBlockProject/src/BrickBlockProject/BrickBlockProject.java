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
        double doorsOnWall = 0;
        
        Scanner k = new Scanner(System.in);
        
        welcome();
        JOptionPane.showMessageDialog(null, "Enter the measurements of the wall in feet. ");
        double length = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Length: "));
        
        double width = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Width: "));
        
        double height = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Height: "));
        
        String yesNo = JOptionPane.showInputDialog("Are there any doors in your wall? 'Yes' or 'No'");
        if (yesNo.equalsIgnoreCase("yes")){
            int doors = 
                    Integer.parseInt(JOptionPane.showInputDialog("How many doors are there in your wall? "));
            for (int i=0; i < doors; i++){
                JOptionPane.showMessageDialog(null, "Enter the doors measurements.");
                double doorLength = 
                        Double.parseDouble(JOptionPane.showInputDialog("Length: "));
                double doorWidth =
                        Double.parseDouble(JOptionPane.showInputDialog("Width: "));
                double doorHeight =
                        Double.parseDouble(JOptionPane.showInputDialog("Height: "));
                double doorArea = doorWidth * doorHeight;
            doorsOnWall += doorArea;
        }
            
            
        }
        
        
        BrickAmt myCube =
                new BrickAmt(length, width, height, doorsOnWall);
        
        
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
         
//what do u need to 
    }
    public static void welcome(){
        JOptionPane.showMessageDialog(null, "Welcome to the Brick Block Program! ");
    }
    public static void goodbye(){
        JOptionPane.showMessageDialog(null, "Thank you for using the program. ");
    }
    
}
