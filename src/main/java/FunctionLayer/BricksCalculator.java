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
public class BricksCalculator {

    private int onextwo = (1);
    private int twoXtwo = (2);
    private int fourXtwo = (4);

    public static void main(String[] args) {
        BricksCalculator cal = new BricksCalculator();
       
    }

    public Bricks calculateBricks(int length, int width, int hieght) {
        int count =0 ,largeBricks = 0, mediumBricks = 0, smallBricks = 0;
        
        count = countOddNumver(length, width);

        if (count == 0) {
            largeBricks = ((length * 2) + ((width*2) - 4 * 2)) / fourXtwo;

        }
        
       else{
            count =countOddNumver(length, width);
            largeBricks = length/fourXtwo + (2*width-4)/fourXtwo +((length-4)/fourXtwo);
//          if(length%4 == 3 ^ width%4 ==3){
//              if (!(width%fourXtwo == width%fourXtwo)){
//                  mediumBricks = 2;
//              }
//          }
            smallBricks = 2*count;
       }
        
        
        return new Bricks(largeBricks*hieght, mediumBricks, smallBricks*hieght);
    }
    
  
    private int countOddNumver(int length, int width){
        int count = 0 ;
        if ( length%2 ==1)
            count++;
        if(width%2 ==1)
            count++;
        return count;
    }

}
