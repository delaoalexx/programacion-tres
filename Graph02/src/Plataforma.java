
import java.awt.Color;
import java.awt.Graphics2D;

public class Plataforma {
	
	private int width;
    private int height;
    private int x;
    private int y;
    private Color color1, color2;

    public Plataforma(int x, int y, int width, int height, Color color1, Color color2) 
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
        	g.setColor(Color.BLACK);
			g.fillRoundRect(x+20, y+15, width, height-11,15,15); //sombra
			g.fillRoundRect(x-5, y-5, width+10, height+10,10,10); //contorno
			g.setColor(color1);
			g.fillRoundRect(x, y, width, height, 5, 5); //color
			g.setColor(color2);
			g.fillRoundRect(x+90, y, width-90, height,5,5); //sombra sup
    }
}
