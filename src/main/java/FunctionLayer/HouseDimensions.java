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
public class HouseDimensions {
    private final int length,width,high;

    public HouseDimensions(int length, int width, int high) {
        this.length = length;
        this.width = width;
        this.high = high;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "HouseDimensions{" + "length=" + length + ", width=" + width + ", high=" + high + '}';
    }
    
    
}
