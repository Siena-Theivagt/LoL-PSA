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

public class Burger extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Burger (constructor) */
   public Burger(Graphics inWin)
   {
      super(inWin);
      System.out.println("Burger()");
      win = getWin();
   } //End Burger()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Burger.draw()");
      
      //draw object using relative coordinates
      win.setColor(Colors.BUN); //bun
      win.fillOval(inX, inY + 80, 240, 95);
      win.setColor(Colors.ALLOYORANGE); //tomato
      win.fillOval(inX, inY + 60, 240, 95);
      
      win.setColor(Colors.PATTY); //meat
      win.fillOval(inX, inY + 40, 240, 95);
      win.setColor(Colors.AMBER);
      win.fillRect(inX + 10, inY + 60, 220, 60);
      //pickles
      win.setColor(Colors.LETTUCE);
      win.fillOval(inX + 10, inY + 70, 60, 50);
      win.fillOval(inX + 60, inY + 70, 60, 50);
      win.fillOval(inX + 110, inY + 70, 60, 50);
      win.fillOval(inX + 170, inY + 70, 60, 50);
      win.setColor(Colors.BUN); //bun
      win.fillOval(inX, inY + 10, 240, 95);
   } //End Burger.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Burger.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Burger.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Burger.draw3()");
   } //End Burger.draw3()
} //close Burger Class