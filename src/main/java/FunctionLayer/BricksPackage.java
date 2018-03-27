/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Tiba
 */
public class BricksPackage {
    
    int  fourXtwoBrick,twoXtwoBrick,oneXtwoBrick;

 

    public BricksPackage(int fourXtwoBrick, int twoXtwoBrick, int oneXtwoBrick) {
        this.twoXtwoBrick = twoXtwoBrick;
        this.oneXtwoBrick = oneXtwoBrick;
        this.fourXtwoBrick = fourXtwoBrick;
    }

    public int getFourXtwoBrick() {
        return fourXtwoBrick;
    }

    public int getTwoXtwoBrick() {
        return twoXtwoBrick;
    }

    public int getOneXtwoBrick() {
        return oneXtwoBrick;
    }
    

     @Override
    public String toString() {
        return "Bricks{" + "fourXtwoBrick=" + fourXtwoBrick + ", twoXtwoBrick=" + twoXtwoBrick + ", oneXtwoBrick=" + oneXtwoBrick + '}';
    }

}
