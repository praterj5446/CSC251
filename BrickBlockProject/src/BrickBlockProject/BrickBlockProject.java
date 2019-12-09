/*
 * Chris, Jessica, Jacob CSC-251-0001
 * GROUP 4
 * Brick block project
 *
 */
package BrickBlockProject;
import java.util.Scanner; 
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class BrickBlockProject {


    public static void main(String[] args) {
        
        int i = 1;
        while(i>0){
        DecimalFormat df = new DecimalFormat("0.00");
        
        double brickP = 8.15625;
        double doorsOnWall = 0;
        double cement = 2.5;
        
        
        
        Scanner k = new Scanner(System.in);
        
        welcome();
        JOptionPane.showMessageDialog(null, "Enter the measurements of the wall in feet. ");
        double length = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Length: "));
        while (length < 0){
            length =
                    Double.parseDouble(JOptionPane.showInputDialog("Please enter a positive number: "));
        }
        
        double width = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Width: "));
        while (width < 0){
            width =
                    Double.parseDouble(JOptionPane.showInputDialog("Please enter a positive number: "));
        }
        
        double height = Double.parseDouble(JOptionPane.showInputDialog
        ("Enter the Height: "));
        while (height < 0){
            height =
                    Double.parseDouble(JOptionPane.showInputDialog("Please enter a positive number: "));
        }
        
        String yesNo = JOptionPane.showInputDialog("Are there any doors or windows in your wall? 'Yes' or 'No'");
        if (yesNo.equalsIgnoreCase("yes")){
            int doors = 
                    Integer.parseInt(JOptionPane.showInputDialog("How many doors or windows are there in your wall? "));
            while (doors< 0){
            doors =
                    Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive number: "));
        }
            for (int i1=0; i1 < doors; i1++){
                JOptionPane.showMessageDialog(null, "Enter the doors/windows measurements.");
                double doorLength = 
                        Double.parseDouble(JOptionPane.showInputDialog("Length: "));
                while (doorLength < 0){
            doorLength =
                    Double.parseDouble(JOptionPane.showInputDialog("Please enter a positive number: "));
        }
                double doorWidth =
                        Double.parseDouble(JOptionPane.showInputDialog("Width: "));
                while (doorWidth < 0){
            doorWidth =
                    Double.parseDouble(JOptionPane.showInputDialog("Please enter a positive number: "));
        }
                double doorHeight =
                        Double.parseDouble(JOptionPane.showInputDialog("Height: "));
                while (doorLength < 0){
            doorHeight =
                    Double.parseDouble(JOptionPane.showInputDialog("Please enter a positive number: "));
        }
                double doorArea = doorWidth * doorHeight;
            doorsOnWall += doorArea;
        }
            
            
        }
        
        
        BrickAmt myCube =
                new BrickAmt(length, width, height, doorsOnWall);
        double cementCost = cement * myCube.getArea();
        double total = cementCost + myCube.getCost();
        
        
                JOptionPane.showMessageDialog(null, "Here are the Wall's Properties. "+
                "\n\nLength: "+ myCube.getLength()
                        +" Ft."+"\nWidth: "+ myCube.getWidth()
                +" Ft."+"\nHeight: "+ myCube.getHeight()
                        +" Ft."+"\nWall Area: "+ myCube.getArea()
                +" Sq Ft."+"\nBrick Amount: "+(Math.ceil(myCube.getBrickAmt()))+
                        "\nBrick Cost: $"+(df.format(myCube.getCost()))+
                        "\nCement Cost: $"+(df.format(cementCost))+
                        "\n\nTotal Cost: $"+(df.format(total)));
                goodbye();
        
        System.out.println("Here are the Wall's properties.");
        
        
        System.out.println("Length: " + myCube.getLength()+" Ft.");
        System.out.println("Width: " + myCube.getWidth()+" Ft.");
        System.out.println("Height: " + myCube.getHeight()+" Ft.");
        System.out.println("Wall Area: " + myCube.getArea()+" Sq Ft.");
        System.out.println("Brick Amount: "+ (df.format(myCube.getBrickAmt())));
        System.out.println("Brick Cost: $"+ (df.format(myCube.getCost())));
        
        String yesNo2 =                
                (JOptionPane.showInputDialog("Would you like to run the program again? "
                        + "Enter 'yes' or 'no"));
        if (yesNo2.equalsIgnoreCase("no")){
            break;
        }
        } 
        
         
//what do u need to 
    }
    public static void welcome(){
        JOptionPane.showMessageDialog(null, "Welcome to the Brick Block Program! ");
    }
    public static void goodbye(){
        JOptionPane.showMessageDialog(null, "Thank you for using the program. ");
    }
    
}
