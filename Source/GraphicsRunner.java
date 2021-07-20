/**
 * GraphicsRunner.java  10/18/2018
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */
import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	public static final int WIDTH = 819;
	public static final int HEIGHT = 648;

	/* Method: GraphicsRunner (constructor) */
	public GraphicsRunner()
	{
		super("Graphics Runner");
		
		System.out.println("GraphicsRunner()");
		setSize(WIDTH, HEIGHT);

		//Instantiate MyCanvas
		getContentPane().add(new MyCanvas());

		setVisible(true);
	}

   /* Method: main (runs program) */
	public static void main(String[] args)
	{
		System.out.println("main()");
		GraphicsRunner run = new GraphicsRunner();
	}
}