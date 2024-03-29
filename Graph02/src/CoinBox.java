import java.awt.Color;
import java.awt.Graphics2D;

public class CoinBox {
	
	private int width;
    private int height;
    private int x;
    private int y;
    private Color color1;    
	    
    public CoinBox(int x, int y, int width, int height, Color color1) 
    {
        super();
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color1 = color1;
    }
        void draw(Graphics2D g) 
        {
        	g.setColor(Color.BLACK);
			g.fillRoundRect(x-5, y, width+5, height+5, 5, 5); //sombra
			g.setColor(color1);
			g.fillRoundRect(x, y, width, height, 5, 5); //color
        }
}
