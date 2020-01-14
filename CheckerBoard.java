/*
 * @author Pirathapan Nagendrajah 
 * Janurary 8th ,2014
 * ICS4U-Final Project
 * Checkers-game - implement the rules of the game, simple computer game 
 */

import java.awt.Color;
import java.awt.Graphics2D;


public class CheckerBoard 
{

 
 
 /**
  * This method draws out the checker board rows and columns; with coloured filled
  * alternating squares
  * 
  * @param g2
  */
 public void draw(Graphics2D g2)
 {
  for (int row=0; row<8; row++) 
   /**
    * This nested loops will compose of 64 squares due to 8 rows by 8 columns
    */
  {
   for (int column=0; column<8; column++)
   {
    if((row % 2) == (column % 2))
     /**
      * This operation assigns the colour black and white alternatively using the mod function*/
     
    {
     g2.setColor(Color.black);
    }
    else
    {
     g2.setColor(Color.white);
     
    }
    
    /**
     * The squares are of equal height and width
     */
    g2.fillRect((column*60), (row*60), 60, 60);
    
    
   }
  }
 }
}
