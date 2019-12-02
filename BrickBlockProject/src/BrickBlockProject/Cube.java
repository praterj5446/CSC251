/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrickBlockProject;


public class Cube extends Rectangle 
{
    private double measurements;

    /**
     *
     * @param len
     * @param w
     * @param h
     */
    public Cube(double len, double w, double h){
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
