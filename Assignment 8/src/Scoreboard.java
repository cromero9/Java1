import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


import java.awt.*;
public class Scoreboard extends JFrame {
	private int redScore;
	private int blueScore;
	private String redCounter;
	private String blueCounter;
	private JLabel redCount;
	private JLabel blueCount;
	public Scoreboard(){
		setTitle("JButton Scoreboard");
		setSize(400, 400);
		ActionListener redList = new redListener();
		ActionListener blueList = new blueListener();
		ActionListener resetList = new resetListener();
		setLayout(new BorderLayout(3,2));
		
		JLabel redLabel = new JLabel("Red Team");
		redLabel.setForeground(Color.RED);
		JLabel blueLabel = new JLabel("Blue Team");
		blueLabel.setForeground(Color.BLUE);
		JButton redButton = new JButton("Red Score!");
		JButton blueButton = new JButton("Blue Score!");
		redCount = new JLabel("0");
		blueCount = new JLabel("0");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		JPanel panel1 = new JPanel();
	    JPanel panel2 = new JPanel();
	    JPanel panel3 = new JPanel();
	    JPanel panel4 = new JPanel();
	    JPanel panel5 = new JPanel();
	    JPanel panel6 = new JPanel();
	    
	    panel1.add(redLabel);
	    panel2.add(blueLabel);
	    panel3.add(redCount);
	    panel4.add(blueCount);
	    panel5.add(redButton);
	    panel6.add(blueButton);
	    
	    redButton.addActionListener(redList);
	    blueButton.addActionListener(blueList);
	    
	    panel.add(panel1);  // Goes into row 1, column 1
	    panel.add(panel2);  // Goes into row 1, column 2
	    panel.add(panel3);  // Goes into row 1, column 3
	    panel.add(panel4);  // Goes into row 2, column 1
	    panel.add(panel5);  // Goes into row 2, column 2
	    panel.add(panel6);
	    add(panel);
	    
	    JButton resetButton = new JButton("Reset Scoreboard");
	    JPanel resetPanel=new JPanel();
	    resetPanel.add(resetButton);
	    add(resetPanel, BorderLayout.SOUTH);
	    
	    resetButton.addActionListener(resetList);
	    
	    setVisible(true);
	    
	    
	    
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	   
	}
public class redListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			redScore++;
			redCounter = Integer.toString(redScore);
			redCount.setText(redCounter);
			Toolkit.getDefaultToolkit().beep();
		}

		
	}
	
public class blueListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		blueScore++;
		blueCounter = Integer.toString(blueScore);
		blueCount.setText(blueCounter);
		Toolkit.getDefaultToolkit().beep();
	}
}
public class resetListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			redScore = 0;
			redCounter = Integer.toString(redScore);
			redCount.setText(redCounter);
			
			blueScore = 0;
			blueCounter = Integer.toString(blueScore);
			blueCount.setText(blueCounter);
			Toolkit.getDefaultToolkit().beep();
		}

	
}


	public static void main(String[] args)
	{
		new Scoreboard();
	}

}
