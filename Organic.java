/**
 * Organic.java  05/4/2021
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 6
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
import java.awt.*;

public class Organic extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Organic (constructor) */
   public Organic(Graphics inWin)
   {
      super(inWin);
      System.out.println("Organic()");
      win = getWin();
   } //End Organic()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Organic.draw()");
      
      //draw object using relative coordinates
      //face
      win.setColor(Colors.WHITE);
      win.fillArc(inX, inY, 100, 100, 0, 180);
      
      win.setColor(Colors.GREEN);
      win.fillArc(inX, inY, 100, 100, 180, 180);
      win.setFont(new Font("BERLIN", Font.PLAIN, 30));
      win.drawString("100%", inX + 15, inY + 45);
      win.setColor(Colors.WHITE);
      win.setFont(new Font("BERLIN", Font.PLAIN, 20));
      win.drawString("ORGANIC", inX + 4, inY + 70);
   } //End Organic.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Organic.draw2()");
      //WATERMELON
      //draw(inX, inY);
      win.setColor(Colors.GREEN); //rind?
      win.fillArc(inX, inY, 100, 100, 180, 180);
      win.fillRect(inX, inY + 42, 100, 10);
      win.setColor(Colors.RED);
      win.fillArc(inX + 5, inY - 5, 90, 95, 180, 180);
      win.setColor(Colors.BLACK);
      win.fillOval(inX + 20, inY + 50, 3, 4);
      win.fillOval(inX + 40, inY + 50, 4, 5);
      win.fillOval(inX + 60, inY + 50, 4, 5);
      win.fillOval(inX + 80, inY + 50, 2, 3);
      win.fillOval(inX + 80, inY + 60, 3, 4);
      win.fillOval(inX + 60, inY + 60, 3, 4);
      win.fillOval(inX + 40, inY + 60, 2, 3);
      win.fillOval(inX + 20, inY + 60, 4, 5);
      win.fillOval(inX + 30, inY + 70, 4, 5);
      win.fillOval(inX + 50, inY + 70, 4, 5);
      win.fillOval(inX + 70, inY + 70, 4, 5);
     //  win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
//       win.setColor(Colors.BLACK); // make frown
//       win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Organic.draw2()
   
   /* Method: draw3 */ //BANNANA
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Organic.draw3()");
      win.setColor(Colors.YELLOW);
      win.fillArc(inX + 0, inY + 0, 80, 80, 160, 180);
      win.setColor(Colors.SIENNA);
      win.fillArc(inX + 6, inY - 19 , 80, 80, 160, 180);
      // win.setColor(Colors.CHARCOAL);
//       win.drawArc(inX + 0, inY + 0, 80, 80, 160, 180);
   } //End Organic.draw3()
   /* Method: draw4 *///APPLE
   public void draw4(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Organic.draw4()");
      win.setColor(Colors.RED);
      win.fillOval(inX + 0, inY + 0, 35, 50);
      win.fillOval(inX + 20, inY + 0, 35, 50);
      win.setColor(Colors.GREEN);
      win.fillOval(inX + 26, inY - 5, 6, 9);
   } //End Organic.draw4()
} //close Organic Class