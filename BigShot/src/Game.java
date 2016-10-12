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
public class Game extends SimpleApp {
	Image piano = new Image("Golden Piano.png");
	Image d = new Image("Devil.png");
	int x;

	public void setupApp(GraphicsContext gc) {
		gc.setFont(new Font(50));
		gc.setTextAlign(TextAlignment.CENTER);
		x = 1;

	}

	public void draw(GraphicsContext gc) {
		gc.setFill(Color.color(1, 1, 1,0.25));
		gc.setGlobalAlpha(0.25);
		gc.drawImage(piano, 0, 0, getWidth(), getWidth());
		gc.setGlobalAlpha(1);
		gc.setFill(Color.LIGHTBLUE);
		gc.fillOval((getWidth() / 2) - 400, getHeight() / 2 - 100, 800, 200);
		gc.setFill(Color.MEDIUMVIOLETRED);
		gc.fillText("This is a coding project. yay", getWidth() / 2, getHeight() / 4);
		gc.fillText("Hello Everyone! How are we doing?", getWidth() / 2, getHeight() / 2);
		gc.fillText("I'm Julia & Madi & Kevin!", getWidth() / 2, getHeight() / 2 + 100);

		gc.drawImage(d, x, 0, 100, 100);

		x = (x + 5+getWidth())%getWidth();
		
		
	}

	public void updateAnimation(long millis) {
	}

	public static void main(String[] args) {
		launch();
	}
}