/**
 * Fire.java  03/23/2021
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */
import java.awt.*;

public class Fire extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Fire (constructor) */
   public Fire(Graphics inWin)
   {
      super(inWin);
      System.out.println("Fire()");
      win = getWin();
   } //End Fire()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Fire.draw()");
      
      //draw object using relative coordinates
      win.setColor(Colors.RED);
      int[] xPoints = {inX + 60, inX + 0, inX + 25, inX + 55, inX + 55, inX + 125, inX + 122, inX + 96};
      int[] yPoints = {inY + 260, inY + 160, inY + 60, inY + 85, inY + 0, inY + 105, inY + 201, inY + 260};
      win.fillPolygon(xPoints, yPoints, 8);
      
      win.setColor(Colors.ORANGE);
      int[] xPoints2 = {inX + 70, inX + 22, inX + 39, inX + 56, inX + 79, inX + 102, inX + 101, inX + 84};
      int[] yPoints2 = {inY + 260, inY + 170, inY + 117, inY + 145, inY + 80, inY + 138, inY + 170, inY + 260};
      win.fillPolygon(xPoints2, yPoints2, 8);
      
      win.setColor(Colors.YELLOW);
      int[] xPoints3 = {inX + 73, inX + 50, inX + 73, inX + 83};
      int[] yPoints3 = {inY + 260, inY + 172, inY + 140, inY + 177};
      win.fillPolygon(xPoints3, yPoints3, 4);
      
      //int[] xPoints3 = {inX + , inX + , inX + , inX + , inX + , inX + , inX + , inX + };
      //int[] yPoints3 = {inY + , inY + , inY + , inY + , inY + , inY + , inY + , inY + };
      //win.fillPolygon(xPoints3, yPoints3, 8);
   } //End Fire.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Fire.draw2()");
      //draw(inX, inY);
      win.setColor(Colors.YELLOW);
      int[] xPoints3 = {inX + 73, inX + 50, inX + 73, inX + 83};
      int[] yPoints3 = {inY + 260, inY + 172, inY + 140, inY + 177};
      win.fillPolygon(xPoints3, yPoints3, 4);
   } //End Fire.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Fire.draw3()");
      win.setColor(Colors.ORANGE);
      int[] xPoints2 = {inX + 70, inX + 22, inX + 39, inX + 56, inX + 79, inX + 102, inX + 101, inX + 84};
      int[] yPoints2 = {inY + 260, inY + 170, inY + 117, inY + 145, inY + 80, inY + 138, inY + 170, inY + 260};
      win.fillPolygon(xPoints2, yPoints2, 8);
      
      win.setColor(Colors.YELLOW);
      int[] xPoints3 = {inX + 73, inX + 50, inX + 73, inX + 83};
      int[] yPoints3 = {inY + 260, inY + 172, inY + 140, inY + 177};
      win.fillPolygon(xPoints3, yPoints3, 4);   
   } //End Fire.draw3()
} //close Fire Class