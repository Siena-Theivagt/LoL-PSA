/**
 * Title.java  05/8/2021
 *
 * @author - Eve Juarez and Danny Poello and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help Mrs. Juarez
 *
 */
import java.awt.*;

public class Backslash extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Backslash (constructor) */
   public Backslash(Graphics inWin)
   {
      super(inWin);
      System.out.println("Backslash()");
      win = getWin();
   } //End Backslash()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Backslash.draw()");
      //draw object using relative coordinates
      win.setColor(Colors.CRIMSON);
      int[] xPoints2 = {inX, inX + 20, inX + 800, inX + 780};
      int[] yPoints2 = {inY + 20, inY, inY + 580, inY + 600};
      win.fillPolygon(xPoints2, yPoints2, 4);   
   } //End Backslash.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Backslash.draw2()");
   } //End Backslash.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Backslash.draw3()");
   } //End Backslash.draw3()
} //close Backslash Class