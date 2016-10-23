/**
 * @brief Create an applet to display your name.
 * @note Practical No. 010
 */
import java.applet.*;
import java.awt.*;


public class MyName extends Applet {
	Font f = new Font("Italic", Font.ITALIC / Font.BOLD, 24);
	public void init() {
		setBackground(Color.green);
	}
	public void paint(Graphics g) {
		g.setFont(f);
		g.setColor(Color.yellow);
		g.fillRect(90, 75, 120, 60);
		g.setColor(Color.red);
		g.drawString("Watumull!", 100, 100);
	}
}

