import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class Pieces extends JComponent {

 ArrayList<JComponent> list = new ArrayList<JComponent>();
 int z[][];
 int x;
 int y;
 Color color;
 private final int RED_PIECE = 0;
 private final int BLACK_PIECE = 1;

 public Pieces(int colx, int coly, Color Piececolor)
 {
  this.x = colx;
  this.y = coly;    
  this.color = Piececolor;
  list = new ArrayList<JComponent>();
 }
 public class GraySpace extends JPanel {
  //Initial variable for the checker piece
  int checkerPiece;

  //Default GraySpace constructor
  public GraySpace() {
   setBackground(Color.LIGHT_GRAY);
  }

  //The GraySpace constructor with the optional parameter to determine if it holds a checker piece
  public GraySpace(int piece) {
   this.checkerPiece = piece;
   setBackground(Color.LIGHT_GRAY); //Sets the panel's background color to white
  }

  protected void paintComponent(Graphics g) {
   super.paintComponent(g);

   //Default width and height variables
   int width = getWidth() -10;
   int height = getHeight() - 10;

   //This switch statement determines which checker piece type appears on the square
   switch (checkerPiece) {
   case RED_PIECE:
    g.setColor(Color.RED);
    g.fillOval(5, 5, width, height);
    break;
   case BLACK_PIECE:
    g.setColor(Color.BLACK);
    g.fillOval(5, 5, width, height);
    break;
   }
  }
 }

 
}

