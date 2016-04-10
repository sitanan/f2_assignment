import java.awt.*;
import javax.swing.*;

public class Game01 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		JPanel panel = 	new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
		panel.setBackground(Color.BLACK);
		frame.add(panel);
		frame.setVisible(true);
	}
}
