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

public class Factory extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Factory (constructor) */
   public Factory(Graphics inWin)
   {
      super(inWin);
      System.out.println("Factory()");
      win = getWin();
   } //End Factory()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Factory.draw()");
      
      //draw object using relative coordinates
      
      //chemny
      win.setColor(Colors.LIGHTGRAY);
      win.fillRect(inX + 500, inY + 0, 30, 100);
      
      win.setColor(Colors.CAPUTMORTUUM);
      win.fillRect(inX + 0, inY + 200, 200, 200);
      win.fillRect(inX + 200, inY + 120, 400, 280);
      win.setColor(Colors.DARKSIENNA);
      int[] xPoints2 = {inX + 200, inX + 200, inX + 400, inX + 600, inX + 600};
      int[] yPoints2 = {inY + 120, inY + 80, inY + 0, inY + 80, inY + 120};
      win.fillPolygon(xPoints2, yPoints2, 5);
      win.setColor(Colors.CAPUTMORTUUM);
      int[] xPoints = {inX + 200, inX + 400, inX + 600};
      int[] yPoints = {inY + 120, inY + 40, inY + 120};
      win.fillPolygon(xPoints, yPoints, 3);
      win.fillRect(inX + 600, inY + 200, 180, 200);
      win.setColor(Colors.ONYX);
      win.fillRect(inX + 300, inY + 260, 200, 140);
      //blades of grass
     //  win.setColor(Colors.GREEN);
//       win.fillArc(inX + 120, inY + 380, 5, 20, 180, 270);
//       win.fillArc(inX + 180, inY + 380, 5, 20, 180, 270);
//       win.fillArc(inX + 100, inY + 380, 5, 20, 180, 270);
       //win.fillPolygon(xPoints, yPoints, 4);
      //face
//       win.setColor(Colors.YELLOW);
//       win.fillOval(inX, inY, 100, 100);
//       win.setColor(Colors.BLACK);
//       win.drawOval(inX, inY, 100, 100);
//       
//       //eyes
//       win.fillOval(inX + 35, inY + 25, 10, 20);
//       win.fillOval(inX + 55, inY + 25, 10, 20);
//       
//       //eyelashes
//       win.drawLine(inX + 38, inY + 20, inX + 35, inY + 16);
//       win.drawLine(inX + 40, inY + 20, inX + 40, inY + 16);
//       win.drawLine(inX + 42, inY + 20, inX + 45, inY + 16);
//       
//       win.drawLine(inX + 58, inY + 20, inX + 55, inY + 16);
//       win.drawLine(inX + 60, inY + 20, inX + 60, inY + 16);
//       win.drawLine(inX + 62, inY + 20, inX + 65, inY + 16);
//       
//       //Mouth
//       win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
   } //End Factory.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Factory.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Factory.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Factory.draw3()");
   } //End Factory.draw3()
} //close Factory Class