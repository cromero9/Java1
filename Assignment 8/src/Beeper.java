import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Beeper extends JFrame{
	private JButton button;
	private int x;
	private String counter;
	
	public Beeper(){
		
		setSize(300,300);

		
		ActionListener listener = new MyListener();
		button = new JButton("0");
		button.setSize(70,70);
		
		add(button);
		button.addActionListener(listener);
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		

	}
public class MyListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
	
			x++;
			counter = Integer.toString(x);
			button.setText(counter);
			Toolkit.getDefaultToolkit().beep();
		}
	}
	public static void main(String[] args){
		Beeper b = new Beeper();	
	}
}
