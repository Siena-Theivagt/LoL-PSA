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

public class Bird extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Bird (constructor) */
   public Bird(Graphics inWin)
   {
      super(inWin);
      System.out.println("Bird()");
      win = getWin();
   } //End Bird()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Bird.draw()");
      
      //draw object using relative coordinates
      win.setColor(Colors.DARKBLUE);
      win.fillArc(inX + 80, inY + 0, 70, 80, 90, 180);
      //head, body, and wing
      win.setColor(Colors.CRIMSON);
      win.fillArc(inX + 50, inY + 20, 100, 80, 180, 180);
      win.fillOval(inX + 120, inY + 40, 40, 40);
      win.fillArc(inX + 140, inY + 50, 20, 20, 0, 180);
      //tale 
      int[] xPoints = {inX + 0, inX + 50, inX + 60, inX + 10};
      int[] yPoints = {inY + 60, inY + 60, inY + 78, inY + 85};
      win.fillPolygon(xPoints, yPoints, 4);
      win.setColor(Colors.CHARCOAL);
      //beak
      win.fillArc(inX + 150, inY + 50, 20, 20, 0, 180);
      //eye
      win.fillOval(inX + 140, inY + 50, 5, 5);
         
//    win.setColor(Colors.YELLOW);
//    win.fillOval(inX, inY, 100, 100);
//    win.setColor(Colors.BLACK);
//    win.drawOval(inX, inY, 100, 100);
//       
//    //eyes
//    win.fillOval(inX + 35, inY + 25, 10, 20);
//    win.fillOval(inX + 55, inY + 25, 10, 20);
//       
//    //eyelashes
//    win.drawLine(inX + 38, inY + 20, inX + 35, inY + 16);
//    win.drawLine(inX + 40, inY + 20, inX + 40, inY + 16);
//    win.drawLine(inX + 42, inY + 20, inX + 45, inY + 16);
//     
//    win.drawLine(inX + 58, inY + 20, inX + 55, inY + 16);
//    win.drawLine(inX + 60, inY + 20, inX + 60, inY + 16);
//    win.drawLine(inX + 62, inY + 20, inX + 65, inY + 16);
   } //End Bird.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Bird.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Bird.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Bird.draw3()");
   } //End Bird.draw3()
} //close Bird Class