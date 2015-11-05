import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;




public class TemperatureConvert extends JFrame
{
	
	public String fDegrees="0";
	public String cDegrees="0";
	public String patch="0";
	public double farenheit=0;
	public double celsius=0;
	JTextArea fArea;
	JTextField cField;
	
	public TemperatureConvert(){
			ActionListener converting = new tempConvert();
	        setLayout(null);
	 		setSize(400, 100);
	 		setLayout(new BorderLayout(1,5));
	 		
	 		JPanel panel = new JPanel();
	 		panel.setLayout(new GridLayout(1,5));
	 		//panel.setSize(200,150);
	 		panel.setVisible(true);
	 		
	 		JLabel cLabel = new JLabel("Celsius: ");
	 		cField = new JTextField(5);
	 		JLabel fLabel = new JLabel("Fahrenheit: ");
	 		fArea = new JTextArea(2,1);
	 		JButton convert = new JButton("Convert");
	 		
	 		panel.add(cLabel);
	 		panel.add(cField);
	 		panel.add(fLabel);
	 		panel.add(fArea);
	 		panel.add(convert);
	 		
	 		add(panel);
	 		convert.addActionListener(converting);
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		setVisible(true);
	 		pack();
	 		
	}
public class tempConvert implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			cDegrees=cField.getText();
			celsius = Double.parseDouble(cDegrees);
			farenheit = ((9.0/5.0)*celsius) + 32;
			fDegrees = Double.toString(farenheit);
			fArea.setText(fDegrees);
			Toolkit.getDefaultToolkit().beep();
		}

		
	}
   public static void main(String[] args)
   { 
	   	
         TemperatureConvert c = new TemperatureConvert();
 	   	System.out.println(c.getContentPane());
       
         
        

    
   }
}
