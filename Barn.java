/**
 * Title.java  05/8/2021
 *
 * @author - Eve Juarez and Danny Poello and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one
 *
 */
import java.awt.*;

public class Barn extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Barn (constructor) */
   public Barn(Graphics inWin)
   {
      super(inWin);
      System.out.println("Barn()");
      win = getWin();
   } //End Barn()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Barn.draw()");
      
      //draw object using relative coordinates
      //face
      win.setColor(Colors.YELLOW);
      win.fillOval(inX, inY, 100, 100);
      win.setColor(Colors.BLACK);
      win.drawOval(inX, inY, 100, 100);
      
      //eyes
      win.fillOval(inX + 35, inY + 25, 10, 20);
      win.fillOval(inX + 55, inY + 25, 10, 20);
      
      //eyelashes
      win.drawLine(inX + 38, inY + 20, inX + 35, inY + 16);
      win.drawLine(inX + 40, inY + 20, inX + 40, inY + 16);
      win.drawLine(inX + 42, inY + 20, inX + 45, inY + 16);
      
      win.drawLine(inX + 58, inY + 20, inX + 55, inY + 16);
      win.drawLine(inX + 60, inY + 20, inX + 60, inY + 16);
      win.drawLine(inX + 62, inY + 20, inX + 65, inY + 16);
      
      //Mouth
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
   } //End Barn.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Barn.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Barn.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Barn.draw3()");
   } //End Barn.draw3()
} //close Barn Class