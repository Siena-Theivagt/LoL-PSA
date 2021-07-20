/**
 * Tree.java  03/23/2021
 *
 * @author - Eve Juarez and Danny Poellot and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */
import java.awt.*;

public class Tree extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Tree (constructor) */
   public Tree(Graphics inWin)
   {
      super(inWin);
      System.out.println("Tree()");
      win = getWin();
   } //End Tree()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Tree.draw()");
      
      //draw object using relative coordinates
      //face      
      //trunk
      win.setColor(Colors.SIENNA);
      win.fillRect(inX + 140, inY + 160, 60, 400);
      //int[] xPoints = {inX + 200, inX + 200, inX + 275, inX + 260};
      //int[] yPoints = {inY + 220, inY + 250, inY + 185, inY + 170};
      int[] xPoints = {inX + 200, inX + 200, inX + 265, inX + 250};
      int[] yPoints = {inY + 219, inY + 250, inY + 170, inY + 155};
      win.fillPolygon(xPoints, yPoints, 4);
      //Leaves
      win.setColor(Colors.FORESTGREEN);
      win.fillOval(inX + 40, inY + 20, 140, 100);
      win.fillOval(inX + 160, inY, 130, 140);
      win.fillOval(inX, inY + 80, 180, 110);
      win.fillOval(inX + 160, inY + 80, 160, 100);
     // win.fillOval(inX + 240, inY + 240, 80, 80);
      //win.fillOval(inX + 280, inY + 260, 80, 100);
      win.fillOval(inX + 120, inY + 90, 80, 100);
   } //End Tree.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Tree.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.LIGHTBARK);
      win.fillRect(inX + 140, inY + 160, 60, 400);
      int[] xPoints = {inX + 200, inX + 200, inX + 265, inX + 250};
      int[] yPoints = {inY + 219, inY + 250, inY + 170, inY + 155};
      win.fillPolygon(xPoints, yPoints, 4);
      win.setColor(Colors.DARKSEAGREEN);
      win.fillOval(inX + 40, inY + 20, 140, 100);
      win.fillOval(inX + 160, inY, 130, 140);
      win.fillOval(inX, inY + 80, 180, 110);
      win.fillOval(inX + 160, inY + 80, 160, 100);
      win.fillOval(inX + 120, inY + 90, 80, 100);
   } //End Tree.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Tree.draw3()");
   } //End Tree.draw3()
} //close Tree Class