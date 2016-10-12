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
	Image piano = new Image("Golden Piano.png");
	public void setupApp(GraphicsContext gc)
	{
		gc.setFont(new Font(50));
		gc.setTextAlign(TextAlignment.CENTER);
	}
	
	public void draw(GraphicsContext gc)
	{
		gc.setFill(Color.BLACK);
		gc.fillOval( (getWidth()/2)-400,getHeight()/2-100, 800, 200);
		gc.setFill(Color.MEDIUMVIOLETRED);
		gc.fillText("This is a coding project. yay", getWidth()/2, getHeight()/2);
		//This draws a black rectangle
		
		gc.drawImage(piano, 100, 100);
		gc.fillText("Hello Everyone! How are we doing?", getWidth()/2, getHeight()/2);
		gc.fillText("I'm Julia & Madi & Kevin!", getWidth()/2, getHeight()/2 + 100);
	}
	
	public void updateAnimation(long millis)
	{
	}

	public static void main(String[] args)
	{
		launch();
	}
}