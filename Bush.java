/**
 * Bush.java  03/25/2021
 *
 * @author - Eve Juarez and Danny Poellot and Siena
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from Mrs. Juarez
 *
 */
import java.awt.*;

public class Bush extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Bush (constructor) */
   public Bush(Graphics inWin)
   {
      super(inWin);
      System.out.println("Bush()");
      win = getWin();
   } //End Bush()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Bush.draw()");
      
      //draw object using relative coordinates

      win.setColor(Colors.AOENGLISH);
      win.fillRect(inX + 60, inY + 140, 160, 40);
      win.setColor(Colors.INDIAGREEN);
      win.fillOval(inX + 40, inY + 30, 60, 60);
      win.fillOval(inX + 190, inY + 20, 70, 70);
      
      win.setColor(Colors.AOENGLISH);
      win.fillOval(inX + 0, inY + 60, 120, 120);
      win.fillOval(inX + 80, inY + 0, 120, 120); 
      win.fillOval(inX + 140, inY + 40, 145, 140);
           
      win.setColor(Colors.PAKISTANGREEN);
      win.fillOval(inX + 70, inY + 90, 90, 90);
      win.fillOval(inX + 140, inY + 90, 90, 90);
      win.fillOval(inX + 110, inY + 60, 70, 70);
      // win.setColor(Colors.CADMIUMGREEN);
//       win.drawOval(inX + 80, inY + 0, 120, 120);
//       win.drawOval(inX + 0, inY + 60, 120, 120);
//       win.drawOval(inX + 140, inY + 40, 145, 140);
      
      //win.setColor(Colors.SIENNA);
      //win.fillRect(inX + 160, inY + 80, 10, 100); 
   } //End Bush.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Bush.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Bush.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Bush.draw3()");
   } //End Bush.draw3()
} //close Bush Class