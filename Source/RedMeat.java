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

public class RedMeat extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: RedMeat (constructor) */
   public RedMeat(Graphics inWin)
   {
      super(inWin);
      System.out.println("RedMeat()");
      win = getWin();
   } //End RedMeat()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("RedMeat.draw()");
      win.setColor(Colors.WHITE);
      win.fillRect(inX + 23, inY - 50, 15, 60);
      win.setColor(Colors.BROWN);
      win.fillOval(inX, inY, 60, 100);
      win.fillOval(inX, inY - 20, 60, 60);
      //draw object using relative coordinates
   } //End RedMeat.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("RedMeat.draw2()");
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
      //win.fillOval(inX, inY + 5, 40, 50);
   } //End RedMeat.draw2()
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("RedMeat.draw3()");
      win.setColor(Colors.MEAT);
      //body
      win.fillRect(inX + 20, inY + 40, 130, 80);
      //belly
      win.fillArc(inX + 20, inY + 100, 130, 30, 180, 180);
      //ribs
      win.setColor(Colors.WHITE);
      win.fillArc(inX + 25, inY + 40, 15, 60, 270, 180);
      win.fillArc(inX + 50, inY + 40, 15, 60, 270, 180);
      win.fillArc(inX + 75, inY + 40, 15, 60, 270, 180);
      win.fillArc(inX + 100, inY + 40, 15, 60, 270, 180);
      win.fillArc(inX + 130, inY + 40, 15, 60, 270, 180);
   } //End RedMeat.draw3()
} //close RedMeat Class