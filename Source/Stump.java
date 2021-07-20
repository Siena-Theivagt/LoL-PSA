/**
 * Stump.java  03/23/2021
 *
 * @author - Eve Juarez and Danny Poellot and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one. *
 */
import java.awt.*;

public class Stump extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Stump (constructor) */
   public Stump(Graphics inWin)
   {
      super(inWin);
      System.out.println("Stump()");
      win = getWin();
   } //End Stump()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Stump.draw()");
      
      //draw object using relative coordinates
      
      //draw the stump
      win.setColor(Colors.SIENNA);
      int[] xPoints = {inX + 20, inX + 40, inX + 40};
      int[] yPoints = {inY + 70, inY + 20, inY + 70}; 
      win.fillPolygon(xPoints, yPoints, 3);
      int[] xPoints2 = {inX + 100, inX + 100, inX + 120};
      int[] yPoints2 = {inY + 30, inY + 70, inY + 70};
      win.fillPolygon(xPoints2, yPoints2, 3);       
      win.fillRect(inX + 40, inY + 10, 60, 60);
      win.setColor(Colors.TAN);
      win.fillOval(inX + 40, inY, 60, 20);
      win.setColor(Colors.SIENNA);
      win.drawOval(inX + 40, inY, 60, 20);
      win.setColor(Colors.BLACK);
      win.drawOval(inX + 45, inY + 5, 50, 10);
   } //End Stump.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Stump.draw2()");
         
      win.setColor(Colors.LIGHTBARK);
      int[] xPoints = {inX + 20, inX + 40, inX + 40};
      int[] yPoints = {inY + 70, inY + 20, inY + 70}; 
      win.fillPolygon(xPoints, yPoints, 3);
      int[] xPoints2 = {inX + 100, inX + 100, inX + 120};
      int[] yPoints2 = {inY + 30, inY + 70, inY + 70};
      win.fillPolygon(xPoints2, yPoints2, 3);       
      win.fillRect(inX + 40, inY + 10, 60, 60);
      win.setColor(Colors.TAN);
      win.fillOval(inX + 40, inY, 60, 20);
      win.setColor(Colors.LIGHTBARK);
      win.drawOval(inX + 40, inY, 60, 20);
      win.setColor(Colors.SIENNA);
      win.drawOval(inX + 45, inY + 5, 50, 10);
   } //End Stump.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Stump.draw3()");
   } //End Stump.draw3()
} //close Stump Class