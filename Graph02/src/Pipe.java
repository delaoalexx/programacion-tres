import java.awt.Color;
import java.awt.Graphics2D;

public class Pipe {
	
	private int width;
    private int height;
    private int x;
    private int y;
    private Color color1, color2;    
	    
    public Pipe(int x, int y, int width, int height, Color color1, Color color2) 
    {
        super();
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color1 = color1;
        this.color2 = color2;
    }
        void draw(Graphics2D g) 
        {
        	//tunel base
			g.setColor(Color.BLACK);
			g.fillRoundRect(x-5, y-5, width+10, height+5, 10, 10); //contorno  x-5, y-5, width+10, height+5, 10, 10
			g.setColor(color1);
			g.fillRoundRect(x, y, width, height, 10, 10); //color x, y, width, height, 10, 10
			g.setColor(color2);
			g.fillRoundRect(x, y+40, 5, height-40, 0, 0); //light verde x, y+40, 5, height-40, 0, 0
			g.fillRoundRect(x+15, y+40, 5, height-40, 0, 0); //light verde x+15, y+40, 5, height-40, 0, 0
			g.fillRoundRect(x+35, y+40, 5, height-40, 0, 0); //light verde x+35, y+40, 5, height-40, 0, 0
			g.setColor(Color.BLACK);
			g.fillRoundRect(x+30, y+40, 5, height-40, 0, 0); //shadow x+30, y+40, 5, height-40, 0, 0
			g.fillRoundRect(x+10, y+40, 5, height-40, 0, 0); //shadow x+10, y+40, 5, height-40, 0, 0
			g.fillRoundRect(x+55, y+40, 25, height-40, 5, 0); //shadow x+55, y+40, 25, height-40, 5, 0
			
			//tunel top
			g.setColor(Color.BLACK);
			g.fillRoundRect(x-10, y-5, width+20, 45, 10, 10); //contorno x-10, y-5, width+20, 45, 10, 10
			g.setColor(color1);
			g.fillRoundRect(x-5, y, width+10, 35, 10, 10); //color x-5, y, width+10, 35, 10, 10
			g.setColor(color2);
			g.fillRoundRect(x-5, y, 5, 35, 0, 0); //light x-5, y, 5, 35, 0, 0
			g.fillRoundRect(x+15, y, 5, 35, 0, 0); //light x+15, y, 5, 35, 0, 0
			g.fillRoundRect(x+35, y, 5, 35, 0, 0); //light x+35, y, 5, 35, 0, 0
			g.setColor(Color.BLACK);
			g.fillRoundRect(x+30, y, 5, 35, 0, 0); //shadow x+30, y, 5, 35, 0, 0
			g.fillRoundRect(x+10, y, 5, 35, 0, 0); //shadow x+10, y, 5, 35, 0, 0
			g.fillRoundRect(x+60, y, 25, 35, 0, 0); //shadow x+60, y, 25, 35, 0, 0
        }
}
