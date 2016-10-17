import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;

public class Bug
{
	private double x;
	private double y;
	private double w;
	private double h;
	private Image img;
	
	private double tx;
	private double ty;
	
	private double ang;
	private double tAng;
	
	public Bug(float x, float y, float size)
	{
		this.x=x;
		this.y=y;
		this.w=size;
	
		this.tx=x;
		this.ty=y;
		this.img = new Image("bug.jpg", this.w, 0, false, false);
		this.h=img.getHeight();
		
	}
	
	public void draw(GraphicsContext gc)
	{
		BlendMode bm = gc.getGlobalBlendMode();
		gc.setGlobalBlendMode(BlendMode.MULTIPLY);
		gc.translate(x, y);
		gc.rotate(ang+90);
		gc.drawImage(img,-w/2, -h/2);
		gc.rotate(-ang-90);
		gc.translate(-(x), -(y));
		updatePosition();
		gc.setGlobalBlendMode(bm);
	}
	
	private void updatePosition()
	{
		//ang = Math.toDegrees(Math.atan2(ty-y, tx-x));
	/*	if (Math.abs(tAng-ang) >5)
		{
			ang+=((tAng-ang)*0.1)%360;
			
		}
		*/
		
		if (Math.abs(tx-x)>10)
		{
			x += (tx-x) * 0.02;
		}
		
		if (Math.abs(ty-y) > 10)
		{
			y+=(ty-y)*0.02;
		}
	}
	
	public void moveTowards(double locX, double locY)
	{
		
		tx = locX;
		ty=locY;
		//tAng = Math.toDegrees(Math.atan2(ty-y, tx-x));
		ang = Math.toDegrees(Math.atan2(ty-y, tx-x));
	}
	
}
