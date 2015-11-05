import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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




public class TemperatureRadio extends JFrame
{

	public String Degrees="0";
	public String Result ="0";
	public double farenheit=0;
	public double celsius=0;
	JTextArea dArea;
	JTextField dField;
	
	public TemperatureRadio(){
			ActionListener fahrenheitConvert = new convertFahrenheit();
			ActionListener celsiusConvert = new convertCelsius();
	        setLayout(null);
	 		setSize(400, 100);
	 		setLayout(new BorderLayout(1,5));
	 		
	 		JPanel panel = new JPanel();
	 		panel.setLayout(new GridLayout(1,5));
	 		panel.setVisible(true);
	 		
	 		JLabel dLabel = new JLabel("Enter a Value in Celsius or Fahrenheit: ");
	 		dField = new JTextField(5);
	 		dArea = new JTextArea(2,1);
	 		
	 		JRadioButton radio1 = new JRadioButton("Convert to Fahrenheit", true);
			JRadioButton radio2 = new JRadioButton("Convert to Celsius");
			ButtonGroup group = new ButtonGroup();
			group.add(radio1);
			group.add(radio2);
			
	 		panel.add(dLabel);
	 		panel.add(dField);
	 		panel.add(radio1);
	 		panel.add(radio2);
	 		panel.add(dArea);

	 		add(panel);
	 		radio1.addActionListener(fahrenheitConvert);
	 		radio2.addActionListener(celsiusConvert);
	 		
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		setVisible(true);
	 		pack();
	 		
	}
public class convertFahrenheit implements ActionListener{
		
			public void actionPerformed(ActionEvent e) {
			Degrees=dField.getText();
			celsius = Double.parseDouble(Degrees);
			farenheit = (1.8*celsius) + 32;
			Result = Double.toString(farenheit);
			dArea.setText(Result);
			Toolkit.getDefaultToolkit().beep();
		}

		
	}
public class convertCelsius implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Degrees=dField.getText();
			farenheit = Double.parseDouble(Degrees);
			celsius = (farenheit - 32)/1.8;
			Result = Double.toString(celsius);
			dArea.setText(Result);
			Toolkit.getDefaultToolkit().beep();
		}

		
	}
   public static void main(String[] args)
   { 
	   	
         TemperatureRadio c = new TemperatureRadio();
 	   	System.out.println(c.getContentPane());
         
        

    
   }
}
