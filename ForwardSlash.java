/**
 * ForwardSlash.java  04/18/2018
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
import java.awt.*;

public class ForwardSlash extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: ForwardSlash (constructor) */
   public ForwardSlash(Graphics inWin)
   {
      super(inWin);
      System.out.println("ForwardSlash()");
      win = getWin();
   } //End ForwardSlash()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("ForwardSlash.draw()");
      
      //draw object using relative coordinates
      win.setColor(Colors.CRIMSON);
      
      int[] xPoints2 = {inX - 26, inX, inX + 820, inX + 800};
      int[] yPoints2 = {inY + 680, inY + 720, inY + 20, inY - 20};
      win.fillPolygon(xPoints2, yPoints2, 4);
      //face
   } //End ForwardSlash.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("ForwardSlash.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End ForwardSlash.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("ForwardSlash.draw3()");
   } //End ForwardSlash.draw3()
} //close ForwardSlash Class