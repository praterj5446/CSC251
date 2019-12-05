/*
 * Class holds data about brick amt
 */
package BrickBlockProject;


public class BrickAmt extends Cost 
{
    private double measurements;

    public BrickAmt(double len, double w, double h){
        super(len, w, h);
    
}


    
    



public double getMeasurements(){
    return measurements;
}

public double getBrickAmt(){
    return getArea() / 0.6796875;
}

public double getCost(){
    return getBrickAmt() * .55;
}
    

}
