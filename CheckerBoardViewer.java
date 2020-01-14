import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/*
 * @author Pirathapan Nagendrajah 
 * Janurary 8th ,2014
 * ICS4U-Final Project
 * Checkers-game - implement the rules of the game, simple computer game 
 */

public class CheckerBoardViewer 
{
  public static void main(String[] args)
  {
    JFrame frame= new JFrame();
    /**
     * This will create a frame to display the checker board; with a set size and title
     */
    frame.setSize(550,550);
    frame.setTitle("Pirathapan's Checkerboard");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    CheckerBoardComponent component = new CheckerBoardComponent();
    /**
     * The object component is created
     */
    frame.add(component);
    frame.setVisible(true);
    
    
  }
  
  
  
  
//public class CheckerBoardComponent extends JComponent 
  
  public void paintComponent(Graphics g)
  {
    Graphics2D g2= (Graphics2D) g; 
    /**
     * This method recovers Graphics2D 
     */
    
    CheckerBoard board= new CheckerBoard();
    /**
     * The object of the type CheckerBoard is created
     */
    board.draw(g2);
    
  }
  
  
  
  // public class CheckerBoard 
  
  
  
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
