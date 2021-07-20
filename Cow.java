/**
 * Cow.java  03/24/2021
 *
 * @author - Eve Juarez and Danny Poellot and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 */
import java.awt.*;

public class Cow extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Cow (constructor) */
   public Cow(Graphics inWin)
   {
      super(inWin);
      System.out.println("Cow()");
      win = getWin();
   } //End Cow()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Cow.draw()");
      //draw object using relative coordinates
      win.setColor(Colors.WHITE);
      //body
      win.fillRect(inX + 20, inY + 40, 130, 80);
      //belly
      win.fillArc(inX + 40, inY + 100, 90, 30, 180, 180);
      win.setColor(Colors.PINK);
      //utter
      //win.fillArc(inX + 30, inY + 100, 40, 30, 180, 180);
      //leg
      win.setColor(Colors.WHITE);
      win.fillRect(inX + 20, inY + 120, 20, 60);
      win.fillRect(inX + 130, inY + 120, 20, 60);    
      win.fillRect(inX + 180, inY + 5, 45, 40);
      int[] xPoints = {inX + 145, inX + 145, inX + 180, inX + 180};
      int[] yPoints = {inY + 40, inY + 110, inY + 45, inY + 5};
      win.fillPolygon(xPoints, yPoints, 4);
      //mouth
      win.setColor(Colors.CONGOPINK);
      win.fillRect(inX + 220, inY + 5, 10, 40);
      win.setColor(Colors.BLACK);
      //spots
      win.fillArc(inX + 55, inY + 15, 50, 50, 180, 180);
      win.fillOval(inX + 70, inY + 40, 40, 37);
      
      win.fillOval(inX + 35, inY + 80, 35, 35);
      win.fillOval(inX + 29, inY + 95, 16, 16);
      
      win.fillOval(inX + 130, inY + 50, 25, 30);
      //eye
      win.fillRect(inX + 195, inY + 15, 10, 10);
      //hooves
      win.fillRect(inX + 20, inY + 170, 20, 10);
      win.fillRect(inX + 130, inY + 170, 20, 10);
      // ears 
      win.setColor(Colors.CHAMPAGNEPINK);
      win.fillRect(inX + 180, inY + 10, 10, 20);
   } //End Cow.draw()
    
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Cow.draw2()");
       //draw object using relative coordinates
      win.setColor(Colors.WHITE);
      //body
      win.fillRect(inX - 130, inY + 40, 130, 80);
      //belly
      win.setColor(Colors.WHITE);
      win.fillArc(inX - 110, inY + 100, 90, 30, 180, 180);
      
//    win.fillArc(inX - 120, inY + 100, 90, 30, 180, 180);
//    win.setColor(Colors.PINK);
      //utter
      //win.fillArc(inX + 30, inY + 100, 40, 30, 180, 180);
      //leg
      win.fillRect(inX - 20, inY + 120, 20, 60);
      win.fillRect(inX - 130, inY + 120, 20, 60);    
      //head
      win.fillRect(inX - 205, inY + 5, 45, 40);
      int[] xPoints = {inX - 125, inX - 125, inX - 160, inX - 160};
      int[] yPoints = {inY + 40, inY + 110, inY + 45, inY + 5};
      win.fillPolygon(xPoints, yPoints, 4);
      
      //lips
      win.setColor(Colors.CONGOPINK);
      win.fillRect(inX - 215, inY + 5, 10, 40);
      
      win.setColor(Colors.BLACK);
      //spots
      win.fillArc(inX - 65, inY + 15, 50, 50, 180, 180);
      win.fillOval(inX - 80, inY + 40, 40, 37);
      
      win.fillOval(inX - 45, inY + 80, 35, 35);
      win.fillOval(inX - 29, inY + 95, 16, 16);
      
      win.fillOval(inX - 125, inY + 50, 25, 30);
      //eye
      win.fillRect(inX - 195, inY + 15, 10, 10);
      //hooves
      win.fillRect(inX - 20, inY + 170, 20, 10);
      win.fillRect(inX - 130, inY + 170, 20, 10);
      // ears 
      win.setColor(Colors.CHAMPAGNEPINK);
      win.fillRect(inX - 180, inY + 10, 10, 20);
   } //End Cow.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Cow.draw3()");
      win.setColor(Colors.COPPER);
      //body
      win.fillRect(inX - 130, inY + 40, 130, 80);
      //belly
      win.fillArc(inX - 110, inY + 100, 90, 30, 180, 180);
//     win.fillArc(inX - 120, inY + 100, 90, 30, 180, 180);
//     win.setColor(Colors.PINK);
      //utter
      //win.fillArc(inX + 30, inY + 100, 40, 30, 180, 180);
      //leg
      win.fillRect(inX - 20, inY + 120, 20, 60);
      win.fillRect(inX - 130, inY + 120, 20, 60);    
      //head
      win.fillRect(inX - 205, inY + 5, 45, 40);
      int[] xPoints = {inX - 125, inX - 125, inX - 160, inX - 160};
      int[] yPoints = {inY + 40, inY + 110, inY + 45, inY + 5};
      win.fillPolygon(xPoints, yPoints, 4);
      //lips
      win.setColor(Colors.LAVENDERBLUSH);
      win.fillRect(inX - 215, inY + 5, 10, 40);
      win.setColor(Colors.UPSBROWN);
      //spots
      win.fillArc(inX - 65, inY + 15, 50, 50, 180, 180);
      win.fillOval(inX - 80, inY + 40, 40, 37);
      win.fillOval(inX - 45, inY + 80, 35, 35);
      win.fillOval(inX - 29, inY + 95, 16, 16);
      win.fillOval(inX - 125, inY + 50, 25, 30);
      //eye
      win.setColor(Colors.BLACK);
      win.fillRect(inX - 195, inY + 15, 10, 10);
      //hooves
      win.fillRect(inX - 20, inY + 170, 20, 10);
      win.fillRect(inX - 130, inY + 170, 20, 10);
      //ears 
      win.setColor(Colors.CHAMPAGNEPINK);
      win.fillRect(inX - 180, inY + 10, 10, 20); 
   } //End Cow.draw3()
   
   /* Method: draw4 */
   public void draw4(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Cow.draw4()");
      //draw object using relative coordinates
      win.setColor(Colors.COPPER);
      //body
      win.fillRect(inX + 20, inY + 40, 130, 80);
      //belly
      win.fillArc(inX + 40, inY + 100, 90, 30, 180, 180);
      //leg
      win.fillRect(inX + 20, inY + 120, 20, 60);
      win.fillRect(inX + 130, inY + 120, 20, 60);    
      win.fillRect(inX + 180, inY + 5, 45, 40);
      //head and neck
      int[] xPoints = {inX + 145, inX + 145, inX + 180, inX + 180};
      int[] yPoints = {inY + 40, inY + 110, inY + 45, inY + 5};
      win.fillPolygon(xPoints, yPoints, 4);
      //mouth
      win.setColor(Colors.CONGOPINK);
      win.fillRect(inX + 220, inY + 5, 10, 40);
      win.setColor(Colors.BLACK);
      //spots
      win.setColor(Colors.UPSBROWN);
      win.fillArc(inX + 55, inY + 15, 50, 50, 180, 180);
      win.fillOval(inX + 70, inY + 40, 40, 37);
      win.fillOval(inX + 35, inY + 80, 35, 35);
      win.fillOval(inX + 29, inY + 95, 16, 16);
      win.fillOval(inX + 130, inY + 50, 25, 30);
      //eye
      win.setColor(Colors.BLACK);
      win.fillRect(inX + 195, inY + 15, 10, 10);
      //hooves
      win.fillRect(inX + 20, inY + 170, 20, 10);
      win.fillRect(inX + 130, inY + 170, 20, 10);
      //ears 
      win.setColor(Colors.CHAMPAGNEPINK);
      win.fillRect(inX + 180, inY + 10, 10, 20);
   } //End Cow.draw()
} //close Cow Class