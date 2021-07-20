/**
 * Sloth.java  03/23/2021
 *
 * @author - Eve Juarez and Danny Poellot and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */
import java.awt.*;

public class Sloth extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Sloth (constructor) */
   public Sloth(Graphics inWin)
   {
      super(inWin);
      System.out.println("Sloth()");
      win = getWin();
   } //End Sloth()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Sloth.draw()");
      
      //draw object using relative coordinates
      //branch
      win.setColor(Colors.SIENNA);
      win.fillRect(inX - 110, inY + 55, 360, 20);
      //body
      win.setColor(Colors.FAWN);
      win.fillOval(inX + 0, inY + 0, 60, 60);
      win.fillOval(inX + 40, inY + 0, 140, 60);
      win.fillRect(inX + 50, inY + 40, 30, 70);
      win.fillRect(inX + 145, inY + 40, 30, 70);
      
      //hands
      win.fillOval(inX + 50, inY + 90, 30, 30);
      win.fillOval(inX + 145, inY + 90, 30, 30);
      //fur details
      // win.setColor(Colors.COPPERS);
//       win.fillRect(inX + 65, inY + 20, 10, 2);
//       win.fillRect(inX + 100, inY + 43, 10, 2);
//       win.fillRect(inX + 120, inY + 28, 10, 2);
//       win.fillRect(inX + 60, inY + 45, 10, 1);
//       win.fillRect(inX + 160, inY + 45, 10, 1);
//       win.fillRect(inX + 160, inY + 16, 10, 1);
      //face
      win.setColor(Colors.BANANAMANIA);
      win.fillOval(inX + 5, inY + 15, 26, 25);
      win.fillOval(inX + 29, inY + 15, 26, 25);
      win.fillOval(inX + 9, inY + 25, 41, 25);
      //eyes
      win.setColor(Colors.COPPERS);
      win.fillOval(inX + 7, inY + 28, 17, 10);
      win.fillOval(inX + 37, inY + 28, 17, 10);
      win.setColor(Colors.CHARCOAL);
      win.fillOval(inX + 16, inY + 30, 6, 6);
      win.fillOval(inX + 40, inY + 30, 6, 6);
      //mouth
      win.setColor(Colors.COPPERS);
      win.setColor(Colors.CHARCOAL);
      win.drawArc(inX + 19, inY + 34, 21, 13, 190, 170);
      win.setColor(Colors.CHARCOAL);
      //branch
   } //End Sloth.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Sloth.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Sloth.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Sloth.draw3()");
   } //End Sloth.draw3()
} //close Sloth Class