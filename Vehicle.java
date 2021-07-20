/**
 * Vehicle.java  03/23/2021
 *
 * @author - Eve Juarez and Danny Poellot and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */
import java.awt.*;

public class Vehicle extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Vehicle (constructor) */
   public Vehicle(Graphics inWin)
   {
      super(inWin);
      System.out.println("Vehicle()");
      win = getWin();
   } //End Vehicle()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Vehicle.draw()");      
      //draw object using relative coordinates
      win.setColor(Colors.GOLDWEBGOLDEN);
      //win.fillArc(inX + 0, inY + 135, 120, 120, 150, 180);
      //win.fillOval(inX + 10, inY + 125, 40, 40);
      int[] xPoints = {inX + 206, inX + 300, inX + 320, inX + 285, inX + 275, inX + 200};
      int[] yPoints = {inY + 0, inY + 0, inY + 140, inY + 140, inY + 40, inY + 40};
      win.fillPolygon(xPoints, yPoints, 6);
      
      int[] xPoints2 = {inX + 285, inX + 275, inX + 199, inX + 180};
      int[] yPoints2 = {inY + 140, inY + 40, inY + 40, inY + 140};
      win.drawPolygon(xPoints2, yPoints2, 4);
      
      win.fillRect(inX + 100, inY + 140, 220, 90);
      
      win.setColor(Colors.ORANGEYELLOW);
      int[] xPoints3 = {inX + 40, inX + 0, inX + 35, inX + 0, inX + 75, inX + 80};
      int[] yPoints3 = {inY + 160, inY + 160, inY + 220, inY + 260, inY + 260, inY + 220};
      win.fillPolygon(xPoints3, yPoints3, 6);
      
      int[] xPoints4 = {inX + 80, inX + 65, inX + 125, inX + 140};
      int[] yPoints4 = {inY + 220, inY + 200, inY + 160, inY + 175};
      win.fillPolygon(xPoints4, yPoints4, 4);
      
      win.setColor(Colors.RICHBLACK);
      win.fillOval(inX + 90, inY + 180, 80, 80);
      win.fillOval(inX + 240, inY + 140, 120, 120);
      win.setColor(Colors.LIGHTGRAY);
      win.fillOval(inX + 110, inY + 200, 40, 40);
      win.fillOval(inX + 263, inY + 163, 75, 75);
   } //End Vehicle.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Vehicle.draw2()");
      //tree??
      win.setColor(Colors.SIENNA);
      win.fillRect(inX - 60, inY - 140, 60, 400);
      //int[] xPoints = {inX + 200, inX + 200, inX + 275, inX + 260};
      //int[] yPoints = {inY + 220, inY + 250, inY + 185, inY + 170};
      int[] xPoints5 = {inX, inX, inX + 65, inX + 50};
      int[] yPoints5 = {inY - 81, inY - 50, inY - 130, inY - 145};
      win.fillPolygon(xPoints5, yPoints5, 4);
      //Leaves
      win.setColor(Colors.FORESTGREEN);
      win.fillOval(inX - 160, inY - 280, 140, 100);
      win.fillOval(inX - 40, inY - 300, 130, 140);
      win.fillOval(inX - 200, inY - 220, 180, 110);
      win.fillOval(inX - 40, inY - 220, 160, 100);
     // win.fillOval(inX + 240, inY + 240, 80, 80);
      //win.fillOval(inX + 280, inY + 260, 80, 100);
      win.fillOval(inX - 80, inY - 210, 80, 100);
      
      //draw object using relative coordinates
      win.setColor(Colors.GOLDWEBGOLDEN);
      //win.fillArc(inX + 0, inY + 135, 120, 120, 150, 180);
      //win.fillOval(inX + 10, inY + 125, 40, 40);
      int[] xPoints = {inX + 206, inX + 300, inX + 320, inX + 285, inX + 275, inX + 200};
      int[] yPoints = {inY + 0, inY + 0, inY + 140, inY + 140, inY + 40, inY + 40};
      win.fillPolygon(xPoints, yPoints, 6);
      
      int[] xPoints2 = {inX + 285, inX + 275, inX + 199, inX + 180};
      int[] yPoints2 = {inY + 140, inY + 40, inY + 40, inY + 140};
      win.drawPolygon(xPoints2, yPoints2, 4);
      
      win.fillRect(inX + 100, inY + 140, 220, 90);
      
      win.setColor(Colors.ORANGEYELLOW);
      int[] xPoints3 = {inX + 40, inX + 0, inX + 35, inX + 0, inX + 75, inX + 80};
      int[] yPoints3 = {inY + 160, inY + 160, inY + 220, inY + 260, inY + 260, inY + 220};
      win.fillPolygon(xPoints3, yPoints3, 6);
      
      int[] xPoints4 = {inX + 80, inX + 65, inX + 125, inX + 140};
      int[] yPoints4 = {inY + 220, inY + 200, inY + 160, inY + 175};
      win.fillPolygon(xPoints4, yPoints4, 4);
      
      win.setColor(Colors.RICHBLACK);
      win.fillOval(inX + 90, inY + 180, 80, 80);
      win.fillOval(inX + 240, inY + 140, 120, 120);
      win.setColor(Colors.LIGHTGRAY);
      win.fillOval(inX + 110, inY + 200, 40, 40);
      win.fillOval(inX + 263, inY + 163, 75, 75);
   } //End Vehicle.draw2()
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Vehicle.draw3()");
   } //End Vehicle.draw3()
} //close Vehicle Class