import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import tsinn.ui.SimpleApp;
import javafx.scene.image.Image;

/**
 * @author Mr. Sinnott
 *
 */
public class Game extends SimpleApp {
	Image piano = new Image("Golden Piano.png");
	Image d = new Image("Devil.png");
	
	private double x;
	private double y;
	private double tx;
	private double ty;

	public void setupApp(GraphicsContext gc) {
		gc.setFont(new Font(50));
		gc.setTextAlign(TextAlignment.CENTER);
		x = getWidth()/2;
		y = getHeight()/2;
	}

	public void draw(GraphicsContext gc) {

		gc.setGlobalAlpha(0.25);
		gc.drawImage(piano, 0, 0, getWidth(), getWidth());
		gc.setGlobalAlpha(1);
		gc.setFill(Color.LIGHTBLUE);
		gc.fillOval((getWidth() / 2) - 400, getHeight() / 2 - 100, 800, 200);
		gc.setFill(Color.MEDIUMVIOLETRED);
		gc.fillText("Click anywhere to move the devil - Kevin", getWidth() / 2, getHeight() / 4);
		gc.fillText("Hello Everyone! How are we doing?", getWidth() / 2, getHeight() / 2);
		gc.fillText("I'm Julia & Madi & Kevin!", getWidth() / 2, getHeight() / 2 + 100);

		gc.drawImage(d, x - 50, y - 50, 100, 100);
		
		if (tx > x) {
			x = x + 5;
		}
		 
		if (tx < x) {
			x = x - 5;
		}
		
		if (ty > y) {
			y = y + 5;
		}
		
		if (ty < y) {
			y = y - 5;
		}
	}

	public void updateAnimation(long millis) {
	}

	public static void main(String[] args) {
		launch();
	}
	
	public void onMousePressed(MouseEvent me) {
		tx = me.getX();
		ty = me.getY();
	}
}