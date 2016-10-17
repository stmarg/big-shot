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
 */
public class Game extends SimpleApp {
	Image bg = new Image("memelord.jpg");
	Image sanic = new Image("sanic.png");
	Image s = new Image("Shrek.png");
	private double x;
	private double y;
	private double tx;
	private double ty;
	private double sx;
	private double sy;
	
	private double deltax;
	private double deltay;
	private double angle;
	
	private double sdeltax;
	private double sdeltay;
	private double sangle;
	
	private int r;
	private int g;
	private int b;

	public void setupApp(GraphicsContext gc) {
		gc.setFont(new Font(50));
		gc.setTextAlign(TextAlignment.CENTER);
		x = getWidth() / 2;
		y = getHeight() / 2;
		
		r = 255;
		g = 140;
		b = 0;
	}

	public void draw(GraphicsContext gc) {
		gc.setGlobalAlpha(0.25);
		gc.drawImage(bg, 0, 0, getWidth(), getWidth());
		gc.setGlobalAlpha(1);
		
		gc.setFill(Color.BLUE);
		gc.fillText("Click Anywhere to Move the Sanic - Kevin", getWidth() / 2, getHeight() / 4);
		gc.fillText("Hello Everyone! How are we doing?", getWidth() / 2, getHeight() / 2);
		gc.fillText("I'm Julia & Madi & Kevin!", getWidth() / 2, getHeight() * 0.66);
		
		//gc.setFill(Color.DARKORANGE);
		gc.setFill(Color.rgb(r, g, b));
		gc.fillText("Gotta Go Fast", tx, ty);
		
		gc.drawImage(sanic, x - 50, y - 50, 100, 100);
		gc.drawImage(s, sx - 50, sy - 50, 100, 100);
		
		x = (x + deltax + getWidth()) % getWidth();
		y = (y + deltay + getHeight()) % getHeight();
		
		sx = (sx + sdeltax + getWidth()) % getWidth();
		sy = (sy + sdeltay + getHeight()) % getHeight();
		
		//Do we need to do this 60 times a second? Doing trig like this in a draw will usually kill performance.
		//could we just have shrek head towards sonic's position by doing something with the detas, slope, and speed of shrek (maybe not, but maybe)?
		sangle = Math.atan2(y - sy, x - sx);
		sdeltax = Math.cos(sangle) * 3;
		sdeltay = Math.sin(sangle) * 3;
	}

	public void updateAnimation(long millis) {
	}

	public static void main(String[] args) {
		System.out.println("Please work... *cries* If this works...");  
		launch();
	}

	public void onMousePressed(MouseEvent me) {
		tx = me.getX();
		ty = me.getY();
		angle = Math.atan2(ty - y, tx - x);
		deltax = Math.cos(angle) * 5;
		deltay = Math.sin(angle) * 5;
		
		r = (int)(Math.random() * 255) + 1;
		g = (int)(Math.random() * 255) + 1;
		b = (int)(Math.random() * 255) + 1;
	}
}