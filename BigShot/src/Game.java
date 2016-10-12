import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import tsinn.ui.SimpleApp;
import javafx.scene.image.Image;

/**
 * @author Mr. Sinnott
 *
 */
public class Game extends SimpleApp
{
	/**
	 * Sets up the initial state of the game
	 * @param gc The GraphicsContext that all drawing will be done to. 
	 */
	
	Image piano = new Image("Golden Piano.png");
	public void setupApp(GraphicsContext gc)
	{
		gc.setFont(new Font(50));
		gc.setTextAlign(TextAlignment.CENTER);
		
	}
	
	/**
	 * Called automatically every draw cycle. Any drawing done to the specified Graphics Context will show on the screen
	 * @param gc The GraphicsContext onto which all drawing should be done.
	 */
	public void draw(GraphicsContext gc)
	{
<<<<<<< HEAD
		gc.setFill(Color.BLACK);
		gc.fillOval( (getWidth()/2)-400,getHeight()/2-100, 800, 200);
		gc.setFill(Color.MEDIUMVIOLETRED);
		gc.fillText("This is a coding project. yay", getWidth()/2, getHeight()/2);
		//This draws a black rectangle
		
=======
		gc.drawImage(piano, 100, 100);
		gc.fillText("Hello Everyone! How are we doing?", getWidth()/2, getHeight()/2);
		gc.fillText("I'm Kevin", getWidth()/2, getHeight()/2 + 100);
>>>>>>> branch 'master' of https://github.com/stmarg/big-shot.git
	}
	
	/**
	 * This is automatically called on a regular interval. It is on a separate thread from the draw.
	 * @param millis The amount of time in milliseconds since the last time this updateAnimation method was called.
	 */
	public void updateAnimation(long millis)
	{
	}

	public static void main(String[] args)
	{
		launch();
	}

}