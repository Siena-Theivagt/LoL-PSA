/**
 * MyCanvas.java  4/25/2021
 *
 * @author - Eve Juarez and Danny Poellot and Siena Theivagt
 * @author - Period 7
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from Mrs. Juarez
 *
 */

import java.awt.*;

public class MyCanvas extends Canvas
{
   /*******************************/
   /****** MyCanvas controls ******/
   /*******************************/

   //Control constants
   private final boolean TEST_MODE = false;
   private final boolean SHOW_GRID = false;
   private final boolean SOPL_MODE = false;
   private final int PAUSE_LENGTH = 5000;
   private final int SHORT_PAUSE = 1000;
   private final int MEDIUM_PAUSE = 3000;  
    
   //Globally declare graphics window
   private Graphics win;
   
   //Globally declare graphic objects
   private Grid myGrid;
   private SampleObject mySampleObject;
   private Tree myTree;
   private Stump myStump;
   private Fire myFire;
   private Carbon myCarbon;
   private Vehicle myVehicle;
   private Cow myCow;
   private Bush myBush;
   private Bird myBird;
   private Money myMoney;
   private Barn myBarn;
   private Title myTitle;
   private Factory myFactory;
   private RedMeat myRedMeat;
   private Organic myOrganic;
   private ForwardSlash myForwardSlash;
   private Market myMarket;
   private Backslash myBackslash;
   private Burger myBurger;
   private Credits myCredits;
   private Sloth mySloth;
	/* Method: MyCanvas (constructor) */
   public MyCanvas()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas()");
   } //end MyCanvas()

	/* Method: paint */
   public void paint(Graphics inWin)
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.paint()");
   	
      //Instantiate object(s)
      win = inWin;
      myGrid = new Grid(win);
      mySampleObject = new SampleObject(win);
      myTree = new Tree(win);
      myStump = new Stump(win);
      myFire = new Fire(win);
      myCarbon = new Carbon(win);
      myVehicle = new Vehicle(win);
      myCow = new Cow(win);
      myBush = new Bush(win);
      myBird = new Bird(win);
      myBarn = new Barn(win);
      myTitle = new Title(win, 270, 400);
      myFactory = new Factory(win);
      myRedMeat = new RedMeat(win);
      myMoney = new Money(win);
      myOrganic = new Organic(win);
      myForwardSlash = new ForwardSlash(win);
      myMarket = new Market(win);
      myBackslash = new Backslash(win);
      myBurger = new Burger(win);
      myCredits = new Credits(win);
      mySloth = new Sloth(win);
      //Test objects and backgrounds or draw scenes
      if (TEST_MODE)
      {
         testObjects();
      }
      else
      {
         //First scene of story: Title Page
         storyScene1();
          //Second scene of story: Cause or Effect
         storyScene2(); 
          //Third scene of story: Cause or Effect
         storyScene3();     
          //Fourth scene of story: Call to Action
         storyScene4();   
          //Third scene of story: Credits Page
         storyScene5();
      }
   } //End MyCanvas.paint()
  
   /*******************************/
   /******** Scene methods ********/
   /*******************************/

	/* Method: storyScene1 */
   public void storyScene1()
   {	
      if (SOPL_MODE)
         System.out.println("MyCanvas.storyScene1()");
      //Draw background
	   //MyCanvas.drawBackground1();
      drawBackground(1);
      
      //Draw title
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("OPENSANS", Font.BOLD, 60));
      win.drawString("Save the Earth", 220, 400);
      //Pause for readers
      pause(SHORT_PAUSE);  
      win.setFont(new Font("OPENSANS", Font.BOLD, 55));
      win.drawString("One Meal at a Time", 190, 460);
      pause(SHORT_PAUSE);
      //Pause for readers
      pause(SHORT_PAUSE);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("OPENSANS", Font.PLAIN, 30));      
      win.drawString("By Siena Theivagt", 300, 500);
      pause(SHORT_PAUSE);
      myBird.animateHorizontalRight(0, 20, 800, 11, this, 100, 4);
      //myVehicle.animateHorizontalLeft(800, 320, -360, 10, this, 100, 4);
   } //End MyCanvas.storyScene1())
   
   /* Method: storyScene2*/
   public void storyScene2()
   {	
      
      if (SOPL_MODE)
         System.out.println("MyCanvas.storyScene2()");
         
      //Draw backgrounds, animated objects, display story text
      drawBackground(1);
      myBush.stampHorizontalRight(0, 400, 600, 400);
      pause(SHORT_PAUSE);
      //text
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 35));
      win.drawString("One and a half acres of rainforest are cleared", 20, 50);
      pause(SHORT_PAUSE); 
      win.drawString("EVERY SECOND.", 240, 90);
            
      //vehicle driving towards  tree
      for (int y = 600, x = 937; y >= 0;  y = y - 10, x = x - 6)
      {
         drawBackground(11);
         myVehicle.draw(x + 50, 320);
         pause(90);
      }
      
      for (int y = 600, x = 585; y >= 0; y = y - 10, x = x - 6)
      {
         drawBackground(5);
         myVehicle.draw2(x + 50, 320);
         pause(90);
      } 
          
      for (int y = 600, x = 240; y >= 0; y = y - 10, x = x - 6)
      {
         drawBackground(6);
         myVehicle.draw2(x + 50, 320);
         pause(90);
      }
      //backgrounds with fire growing
      drawBackground(8);
      pause(MEDIUM_PAUSE);
      drawBackground(9);
      pause(MEDIUM_PAUSE);
      drawBackground(10);
      pause(MEDIUM_PAUSE);
   } //End MyCanvas.storyScene2()
   
   /* Method: storyScene3*/
   public void storyScene3()
   {	
      if (SOPL_MODE)
         System.out.println("MyCanvas.storyScene3()");         
      //Draw backgrounds, animated objects, display story text
     //Cows walking across the screen
      win.setColor(Colors.GREEN);
      win.fillRect(0, 0, 800, 600);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 45));
      win.drawString("80% of Amazon deforestation ", 80, 260);
      win.drawString("stems from cattle ranching.", 100, 340);
      myStump.stampHorizontalRight(40, 20, 800, 200);
      myStump.stampHorizontalRight(40, 120, 800, 200);
      myStump.stampHorizontalRight(40, 380, 800, 200);
      myStump.stampHorizontalRight(40, 500, 800, 200);
      pause(SHORT_PAUSE);
      pause(7000);
      
      for (int x = 0; x <= 800; x = x + 10)
      {
         drawBackground(3);
         myCow.draw3(620 - x, 100);
         myCow.draw2(250 - x, 200);
         myCow.draw4(x, 200);
         myCow.draw(x + 300, 200); 
         myCow.draw(x + 100, 370);
         myCow.draw3(560 - x, 420);
         pause(110);
      }
      //cow moving through factory
      drawBackground(2);
      myFactory.animateHorizontalLeft(800, 170, -150, 11, this, 100, 2);
      myFactory.animateHorizontalLeft(-150, 170, -400, 11, this, 100, 12); 
      pause(MEDIUM_PAUSE);    
      pause(MEDIUM_PAUSE);     
   } //End MyCanvas.storyScene3()
   
      /* Method: storyScene4*///Cut down on meat
   public void storyScene4()
   {	
      if (SOPL_MODE)
         System.out.println("MyCanvas.storyScene4()");
      //Draw backgrounds, animated objects, display story text
      drawBackground(15);
      pause(MEDIUM_PAUSE);
      myBurger.animateVerticalDown(450, 400, 580, 8, this, 100, 17);
      myBurger.animateVerticalDown(450, 180, 600, 8, this, 100, 18);
      //buy beef at farmer's market
      drawBackground(0);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 40)); //this is the same as background 16
      win.drawString("If you eat meat, purchase", 139, 60);
      win.drawString("beef at your local farmer's market.", 75, 110);
      myRedMeat.draw(450, 330);
      myMarket.draw(250, 180);
      myRedMeat.draw3(260, 350);
      pause(8000);
      //eat organic foods
      drawBackground(0);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 40)); 
      win.drawString("Also, eat local and organic foods that ", 55, 60);
      win.drawString("are in season.", 270, 106);
      myMarket.draw(250, 180);
      myOrganic.draw(300, 330); //sticker
      myOrganic.draw2(430, 330); //watermelon
      myOrganic.draw4(230, 530); //apple
      myOrganic.draw3(280, 500); //banana
      pause(8000);
       //Conclusion
      drawBackground(20);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("OPENSANS", Font.BOLD, 40));
      win.drawString("By making these simple", 180, 250);
      win.drawString("dietary changes", 270, 310);
      win.drawString("You can save the Earth", 200, 380);
      win.setFont(new Font("OPENSANS", Font.ITALIC, 60));
      win.drawString("One meal at a time", 150, 460);
      //myBird.animateHorizontalRight(0, 40, 820, 11, this, 100, 20);
      pause(8000);
   } //End MyCanvas.storyScene4()
   
   /* Method: storyScene5*/
   public void storyScene5()
   {	
      if (SOPL_MODE)
         System.out.println("MyCanvas.storyScene5()");      
      //Draw backgrounds, animated objects, display story text
      drawBackground(19);
      myCredits.animateVerticalUp(0, 500, -700, 9, this, 100, 20);
      pause(90000);
   } //End MyCanvas.storyScene5()
   
   /*******************************/
   /****** Background methods *****/
   /*******************************/

	/* Method: drawBackground */
   public void drawBackground(int inChoice)
   {	
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground()  Background #: " + inChoice);
   
      //Select background to draw
      //Background 0 is the test background
      if (inChoice == 0)
      {
         drawBackground0();
      }
      else if (inChoice == 1)
      {
         drawBackground1();
      }
      else if (inChoice == 2)
      {
         drawBackground2();
      }
      else if (inChoice == 3)
      {
         drawBackground3();
      }
      else if (inChoice == 4)
      {
         drawBackground4();
      }
      else if (inChoice == 5)
      {
         drawBackground5();
      }
      else if (inChoice == 6)
      {
         drawBackground6();
      }
      else if (inChoice == 7)
      {
         drawBackground7();
      }
      else if (inChoice == 8)
      {
         drawBackground8();
      }
      else if (inChoice == 9)
      {
         drawBackground9();
      }
      else if (inChoice == 10)
      {
         drawBackground10();
      }
      else if (inChoice == 11)
      {
         drawBackground11();
      }
      else if (inChoice == 12)
      {
         drawBackground12();
      }
      else if (inChoice == 13)
      {
         drawBackground13();
      }      //Draw grid
      else if (inChoice == 14)
      {
         drawBackground14();
      }  //beef exiting  factory
      else if (inChoice == 15)
      {
         drawBackground15();
      }      //burger
      else if (inChoice == 16)
      {
         drawBackground16();
      }      //market
      else if (inChoice == 17)
      {
         drawBackground17();
      }  
      else if (inChoice == 18)
      {
         drawBackground18();
      }
      else if (inChoice == 19)
      {
         drawBackground19();
      }
      else if (inChoice == 20)
      {
         drawBackground20();
      }
      if (SHOW_GRID)
      {
         myGrid.draw(0, 0, GraphicsRunner.WIDTH, GraphicsRunner.HEIGHT);
      }
   } //End MyCanvas.drawBackground()
   
   /* Method: drawBackground0 */
   public void drawBackground0()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground0()");
      
      //Set solid color background
      win.setColor(Colors.SKYBLUE);
      win.fillRect(0, 0, 800, 620);
      //Draw Title
   } //End MyCanvas.drawBackground0()
   
   /* Method: drawBackground1 */
   public void drawBackground1()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground1()");     
      win.setColor(Colors.SKYBLUE);
      win.fillRect(0, 0, 800, 600);
      myTree.draw2(520, 40);
      myTree.draw2(250, 100);
      myTree.draw2(-40, 20);
      myTree.draw(430, 20); 
      myTree.draw(80, 20);
      //sloth
      mySloth.draw(340, 230);
      win.setColor(Colors.GREEN);
      win.fillRect(0, 580, 800, 30); 
      myBush.stampHorizontalRight(0, 400, 600, 400);     
   } //End MyCanvas.drawBackground1()
   
   /* Method: drawBackground2 */
   public void drawBackground2()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground2()");     
      win.setColor(Colors.XIKETIC);
      win.fillRect(0, 0, 820, 620);
      win.setColor(Colors.MISTYMOSS);
      win.fillRect(0, 570, 820, 60);
      myCow.draw(300, 390);
   } //End MyCanvas.drawBackground2()
   
   /* Method: drawBackground3 */// grassy background
   public void drawBackground3()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground3()");   
      win.setColor(Colors.GREEN);
      win.fillRect(0, 0, 800, 600);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 35));
      win.drawString("Cows produce methane and nitrus oxide,", 80, 60);
      win.drawString("which contribute to global warming.", 100, 100);        
   } //End MyCanvas.drawBackground3()
   
/* Method: drawBackground4 */
   public void drawBackground4()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground4()");
      drawBackground1();
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 60));
      win.drawString("Save the Earth", 220, 400);
      win.setFont(new Font("BERLIN", Font.BOLD, 55));
      win.drawString("One Meal at a Time", 190, 460);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.PLAIN, 30));      
      win.drawString("By Siena Theivagt", 300, 500);
   } //End MyCanvas.drawBackground4()

/* Method: drawBackground5 *///SCENE WITH 1 TREES CUT DOWN
   public void drawBackground5()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground5()");   
      win.setColor(Colors.SKYBLUE);
      win.fillRect(0, 0, 800, 600);
      myTree.draw2(520, 40);
      myTree.draw2(250, 100);
      myTree.draw2(-40, 20);
      myTree.draw(80, 20);
      win.setColor(Colors.GREEN);
      win.fillRect(0, 580, 800, 30);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 35));
      win.drawString("One and a half acres of rainforest are cleared", 20, 50); 
      win.drawString("EVERY SECOND.", 240, 90);
      myBush.stampHorizontalRight(0, 400, 600, 400);  
   } //End MyCanvas.drawBackground5()
   
/* Method: drawBackground6 */
   public void drawBackground6()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground6()");   
      win.setColor(Colors.SKYBLUE);
      win.fillRect(0, 0, 800, 600);
      myTree.draw2(520, 40);
      myTree.draw2(250, 100);
      myTree.draw2(-40, 20);
      win.setColor(Colors.GREEN);
      win.fillRect(0, 580, 800, 30); 
      myBush.stampHorizontalRight(0, 400, 600, 400);   
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 35));
      win.drawString("One and a half acres of rainforest are cleared", 20, 50); 
      win.drawString("EVERY SECOND.", 240, 90); 
   } //End MyCanvas.drawBackground6() 
   
   /* Method: drawBackground7 *///SCENE WITH 2 TREES CUT DOWN
   public void drawBackground7()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground7()");   
      win.setColor(Colors.SKYBLUE);
      win.fillRect(0, 0, 800, 600);
      myTree.draw2(520, 40);
      myTree.draw2(250, 100);
      myTree.draw2(-40, 20);
      win.setColor(Colors.GREEN);
      win.fillRect(0, 580, 800, 30); 
      myBush.stampHorizontalRight(0, 400, 600, 400);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 30));
      win.drawString("Rainforests are burned to make room for raising cattle.", 10, 50);  
   } //End MyCanvas.drawBackground7()  
   
   /* Method: drawBackground8 */
   public void drawBackground8()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground8()");   
         //draw background of fire spreading
      drawBackground(7);
      myFire.draw2(100, 320);
      myFire.draw2(300, 320);
      myFire.draw2(500, 320);
   } //End MyCanvas.drawBackground8() 

   /* Method: drawBackground9 */
   public void drawBackground9()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground9()");   
         //draw background of fire spreading
      drawBackground(7);
      myFire.draw3(100, 320);
      myFire.draw3(300, 320);
      myFire.draw3(500, 320);
   }//End MyCanvas.drawBackground9()
  
   /* Method: drawBackground10 */
   public void drawBackground10()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground10()");   
         //draw background of fire spreading
      drawBackground(7);
      myFire.draw(100, 320);
      myFire.draw(300, 320);
      myFire.draw(500, 320);
   } //End MyCanvas.drawBackground10()      
   
   /* Method: drawBackground11 */
   public void drawBackground11()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground11()");   
         //draw background
      drawBackground(1);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 35));
      win.drawString("One and a half acres of rainforest are cleared", 20, 50);
      win.drawString("EVERY SECOND.", 240, 90); 
   } //End MyCanvas.drawBackground11()    
   
   /* Method: drawBackground12 */
   public void drawBackground12()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground12()");   
         //draw background with meat coming out the factory 
      drawBackground(2);
      win.setColor(Colors.XIKETIC);
      win.fillRect(0, 0, 820, 620); 
      win.setColor(Colors.MISTYMOSS);
      win.fillRect(0, 570, 820, 60);
      myRedMeat.draw3(400, 400);
      win.setColor(Colors.LIGHTGRAY);
      win.setFont(new Font("BERLIN", Font.BOLD, 35));
      win.drawString("The average American eats 111 pounds", 60, 55);
      win.drawString("of red meat per year.", 210, 110);
   } //End MyCanvas.drawBackground12()
   
   /* Method: drawBackground13 */
   public void drawBackground13()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground13()");   
         //draw background with meat coming out the factory 
      drawBackground(2);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 40));
      win.drawString("Why?", 150, 50);
   } //End MyCanvas.drawBackground13()

    /* Method: drawBackground14 */
   public void drawBackground14()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground14()");   
         //draw background with meat coming out the factory 
      drawBackground(2);
      myRedMeat.draw3(500, 400);
   } //End MyCanvas.drawBackground14()
   
   /* Method: drawBackground15 */
   public void drawBackground15()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground15()");   
      drawBackground(0);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 40));
      win.drawString("This deforestation crisis can be", 80, 60);
      win.drawString(" improved with simple behavior changes,", 5, 100);
      win.drawString("such as reducing your meat consumption.", 5, 140);
      myBurger.draw(100, 180);
      myBurger.draw(450, 180);
      myBurger.draw(100, 380);
      myBurger.draw(450, 380);
   }// 
   /* Method: drawBackground16 */
   public void drawBackground16()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground16()");   
      drawBackground(0);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("OPENSANS", Font.PLAIN, 40));
      win.drawString("If you eat meat, purchase beef at ", 10, 60);
      win.drawString("local farmer's market.", 15, 106);
   } //End MyCanvas.drawBackground16()
   
   /* Method: drawBackground17 */
   public void drawBackground17()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground17()");   
      drawBackground(0);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 40));
      win.drawString("This deforestation crisis can be", 80, 60);
      win.drawString(" improved with simple behavior changes,", 5, 100);
      win.drawString("such as reducing your meat consumption.", 5, 140);
      myBurger.draw(100, 180);
      myBurger.draw(450, 180);
      myBurger.draw(100, 380);
   } //End MyCanvas.drawBackground17()
   
   /* Method: drawBackground18 */
   public void drawBackground18()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground18()");   
      drawBackground(0);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 40));
      win.drawString("This deforestation crisis can be", 80, 60);
      win.drawString(" improved with simple behavior changes,", 5, 100);
      win.drawString("such as reducing your meat consumption.", 5, 140);
      myBurger.draw(100, 180);
      myBurger.draw(100, 380);
   } //End MyCanvas.drawBackground18()
   
   /* Method: drawBackground19 */
   public void drawBackground19()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground19()");   
      win.setColor(Colors.BLACK);
      win.fillRect(0, 0, 820, 620);
   } //End MyCanvas.drawBackground19()
   
   /* Method: drawBackground20 */
   public void drawBackground20()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.drawBackground20()");   
      //sky
      win.setColor(Colors.LIGHTBLUE);
      win.fillRect(0, 0, 820, 200);
      //sun
      win.setColor(Colors.ORANGEYELLOW);
      win.fillOval(360, 40, 80, 80);      
      //water fall
      win.setColor(Colors.SKYBLUE);
      win.fillRect(300, 200, 200, 200);
      win.setColor(Colors.CADETBLUE);
      win.drawLine(320, 320, 320, 220);
      win.drawLine(400, 350, 400, 250);
      win.fillRect(460, 230, 1, 100);
      //foam
      win.setColor(Colors.MISTYROSE);
      win.fillArc(300, 375, 60, 50, 0, 180);
      win.fillOval(350, 380, 60, 60);
      win.fillOval(390, 370, 60, 60);
      win.fillOval(440, 380, 60, 60);
      //water
      win.setColor(Colors.SKYBLUE);
      win.fillRect(0, 400, 810, 200);
      win.setColor(Colors.CADETBLUE);
      win.drawLine(340, 500, 400, 500);
      win.drawLine(300, 430, 340, 430);
      win.fillRect(500, 470, 49, 1);
      win.fillRect(570, 540, 47, 1); 
      //hills
      win.setColor(Colors.GREEN);
      win.fillRect(0, 200, 300, 200);
      win.fillRect(500, 200, 300, 200);
      //trees
      myTree.draw2(-35, 320);
      myTree.draw(600, 380);
      //brush
      myBush.draw(10, 500);
      myBush.draw(-100, 425);
      myBush.draw(580, 440);
   } //End MyCanvas.drawBackground20()
   /*******************************/
   /*** Test and support methods **/
   /*******************************/
	/* Method: testObjects */
   public void testObjects()
   {
      if (SOPL_MODE)
         System.out.println("MyCanvas.testObjects()");
      //Test backgrounds
      drawBackground(0);
      pause(SHORT_PAUSE);
      drawBackground(1);
      pause(10000);
      drawBackground(2);
      pause(10000);
      drawBackground(3);
      pause(SHORT_PAUSE);
      //Test objects
     //  drawBackground(0);
      win.setFont(Fonts.MSS_B30);
      win.setColor(Colors.BLACK);
      win.drawString("Display Objects Test!", 190, 300); 
      //pause(PAUSE_LENGTH);  
      drawBackground(0); 
      //Add all objects to test here
      //Sample Object
//      mySampleObject.draw(0, 40);
      //Object 1
//      myTree.draw(100, 0);
      //Object 2
//      myStump.draw(330, 500);
//       //Object 3
//        myFire.draw(660, 320);
//       //Object 4
//       myCarbon.draw(500, 100);
//       //Bush
//       myBush.draw(500, 0);
//       //Object 5
//       myVehicle.draw(300, 320);
//       //Object 6
//       myCow.draw(0, 400);
//         myBarn.draw(200, 300);
      //Pause to see all objects
      //pause(10000);
      pause(10000);
      //***** Stamped Objects
//       drawBackground(0);
//       win.setFont(Fonts.MSS_B30);
//       win.setColor(Colors.BLACK);
//       win.drawString("Stamp SDG Object Test!", 190, 300);   
//      // pause(PAUSE_LENGTH);   
//       // stampHorizontalRight(int inStartX, int inY, 
//       //                      int inEndX, int inSpacingX)       
//       drawBackground(0);
//       myBird.stampHorizontalRight(0, 400, 800, 100);
//       pause(SHORT_PAUSE);
//       
//       // stampHorizontalLeft(int inStartX, int inY, 
//       //                     int inEndX, int inSpacingX)       
//       drawBackground(0);
//       myBird.stampHorizontalLeft(800, 0, 0, 100);
//       pause(SHORT_PAUSE);      
//       
//       
//       // stampVerticalDown(int inX, int inStartY, 
//       //                   int inEndY, int inSpacingY)      
//       drawBackground(0);
//       myBird.stampVerticalDown(600, 0, 500, 100);
//       pause(SHORT_PAUSE);
//       
//            
//       // stampVerticalUp(int inX, int inStartY, int inEndY, int inSpacingY)   
//       drawBackground(0);
//       myBird.stampVerticalUp(0, 500, 0, 100);
//       pause(SHORT_PAUSE);  
//       // stampDiagonalRightDown(int inStartX, int inStartY, int inEndX, 
//       //                        int inEndY, int inSpacingX, int inSpacingY)
//       drawBackground(0);
//       myBird.stampDiagonalRightDown(0, 0, 800, 600, 135, 100);
//       pause(SHORT_PAUSE);  
//          
//       // stampDiagonalLeftUp(int inStartX, int inStartY, int inEndX, 
//       //                     int inEndY, inSpacingX, int inSpacingY)
//       drawBackground(0);
//       myBird.stampDiagonalLeftUp(800, 600, 0, 0, 135, 100);
//       pause(SHORT_PAUSE);
//       // stampDiagonalLeftDown(int inStartX, int inStartY, int inEndX, 
//       //                       int inEndY,int inSpacingX, int inSpacingY)
//       drawBackground(0);
//       myBird.stampDiagonalLeftDown(800, 0, 0, 600, 135, 100);
//       pause(SHORT_PAUSE);
//       // stampDiagonalRightUp(int inStartX, int inStartY, int inEndX, 
//       //                      int inEndY, int inSpacingX, int inSpacingY)      
//       drawBackground(0);
//       myBird.stampDiagonalRightUp(0, 600, 800, 0, 135, 100);
//       pause(SHORT_PAUSE);
//       //***************************** 
//       //****** Animation Tests ******
//       //*****************************
//       drawBackground(0);
//       win.setFont(Fonts.MSS_B30);
//       win.setColor(Colors.BLACK);
//       win.drawString("Animate SDG Object Test!", 190, 300);   
//       pause(PAUSE_LENGTH);   
//       //animateHorizontalRight(int inStartX, int inY, int inEndX, 
//       //                       int inSpacingX, MyCanvas inMyCanvas, 
//       //                       int inPause, int inBackground)     
//       drawBackground(1);
//       myBird.animateHorizontalRight(0, 0, 700, 5, this, 100, 1);	
//       pause(SHORT_PAUSE);
//    
//    // animateHorizontalLeft(int inStartX, int inY, int inEndX, int inSpacingX, 
//    //                       MyCanvas inMyCanvas, int inPause, int inBackground)
//       drawBackground(1);
//       myBird.animateHorizontalLeft(800, 500, 0, 5, this, 100, 1);	
//       pause(SHORT_PAUSE);
//       
//    // animateVerticalDown(int inX, int inStartY,  int inEndY, int inSpacingY, 
//    //                     MyCanvas inMyCanvas, int inPause, int inBackground)
//       drawBackground(1);
//       myBird.animateVerticalDown(0, 0, 500, 5, this, 100, 1);	
//       pause(SHORT_PAUSE);
//        
//    // animateVerticalUp(int inX, int inStartY, int inEndY, int inSpacingY, 
//    //                   MyCanvas inMyCanvas, int inPause,  int inBackground)
//       drawBackground(1);
//       myBird.animateVerticalUp(0, 500, 0, 5, this, 100, 1);	
//       pause(SHORT_PAUSE);
//    // animateDiagonalRightDown(int inStartX, int inStartY, 
//    //                          int inEndX, int inEndY,
//    //                          int inSpacingX, int inSpacingY, 
//    //                          MyCanvas inMyCanvas, int inPause, 
//    //                          int inBackground)
//       drawBackground(1);
//       myBird.animateDiagonalRightDown(0, 0, 700, 500, 15, 5, this, 100, 1);	
//       pause(SHORT_PAUSE);
//        
//    // animateDiagonalLeftUp(int inStartX, int inStartY, 
//    //                       int inEndX, int inEndY,  
//    //                       int inSpacingX, int inSpacingY, 
//    //                       MyCanvas inMyCanvas, int inPause, 
//    //                       int inBackground)
//       drawBackground(1);
//       myBird.animateDiagonalLeftUp(800, 600, 0, 0, 15, 5, this, 100, 1);	
//       pause(SHORT_PAUSE);  
//    // animateDiagonalLeftDown(int inStartX, int inStartY, 
//    //                         int inEndX, int inEndY, 
//    //                         int inSpacingX, int inSpacingY, 
//    //                         MyCanvas inMyCanvas, int inPause, 
//    //                         int inBackground)
//       drawBackground(1);
//       myBird.animateDiagonalLeftDown(800, 0, 0, 600, 5, 5, this, 100, 1);	
//       pause(SHORT_PAUSE); 
//    // animateDiagonalRightUp(int inStartX, int inStartY, 
//    //                        int inEndX, int inEndY, 
//    //                        int inSpacingX, int inSpacingY, 
//    //                        MyCanvas inMyCanvas, int inPause, 
//    //                        int inBackground)  
//       drawBackground(1);
//       myBird.animateDiagonalRightUp(0, 600, 800, 0, 5, 5, this, 100, 1);	
//       pause(SHORT_PAUSE);
   } //End Mycanvas.testObjects()
   
	/* Method: pause */
   public void pause(double n)
   {
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;
      while (endDelay - startDelay < n)
      {
         endDelay = System.currentTimeMillis();
      }
   } //End MyCanvas.pause()
} //End MyCanvas class