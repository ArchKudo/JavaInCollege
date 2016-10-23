/**
 * @brief Write a Java program to demonstrate lifecycle of an applet.
 * @note Practical No. 010
 */
import java.applet.*;
import java.awt.*;

public class Lifecycle extends Applet {
	StringBuffer buffer;
	public void init() {
		buffer = new StringBuffer();
		addItem("Initialised");
	}
	public void start() {
		addItem("Starting");
	}
	public void destroy() {
		addItem("Destroying");
	}
	private void addItem(String s) {
		System.out.println(s);
		buffer.append(s);
	}
	public void paint(Graphics g) {
		addItem("Displaying");
		g.drawString(buffer.toString(), 5, 15);
	}
}
