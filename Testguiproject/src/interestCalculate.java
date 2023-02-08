import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class interestCalculate {

	private JFrame frame;
	private JTextField weightvalue;
	private JTextField heightvalue;
	private JTextField bmivalue;
	private JTextField textresults;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interestCalculate window = new interestCalculate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interestCalculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Weight");
		lblNewLabel.setBounds(26, 44, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setBounds(26, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		weightvalue = new JTextField();
		weightvalue.setBounds(82, 38, 136, 27);
		frame.getContentPane().add(weightvalue);
		weightvalue.setColumns(10);
		
		heightvalue = new JTextField();
		heightvalue.setBounds(79, 83, 139, 27);
		frame.getContentPane().add(heightvalue);
		heightvalue.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BMI:");
		lblNewLabel_2.setBounds(39, 134, 30, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		bmivalue = new JTextField();
		bmivalue.setBounds(79, 136, 139, 23);
		frame.getContentPane().add(bmivalue);
		bmivalue.setColumns(10);
		
		JButton ENTER = new JButton("ENTER");
		ENTER.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double weight = Double.parseDouble(weightvalue.getText());
				double height = Double.parseDouble(heightvalue.getText());
				double BMI = (100*100*weight) / (height * height);
		
				String  calculatebmi = String.format("%.2f", BMI);
				bmivalue.setText(calculatebmi);
				
				if		 (BMI < 18.5) {
					textresults.setText("you underweight   ");
                } else if (BMI < 25) {
                	textresults.setText("you normalweight   ");
                } else if (BMI < 30) {
                	textresults.setText("you overweight   ");
                } else {
                	textresults.setText("you obese   ");
                }
				
			

			
			}
		});
		ENTER.setBounds(130, 185, 89, 23);
		frame.getContentPane().add(ENTER);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				weightvalue.setText(null);
				heightvalue.setText(null);
				bmivalue.setText(null);
				textresults.setText(null);
			}
		});
		Clear.setBounds(242, 185, 89, 23);
		frame.getContentPane().add(Clear);
		
		JLabel lblNewLabel_3 = new JLabel("* kg");
		lblNewLabel_3.setBounds(228, 44, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("* cm");
		lblNewLabel_4.setBounds(228, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(179, 219, 89, 23);
		frame.getContentPane().add(exit);
		
		JLabel lblNewLabel_5 = new JLabel("BMI CALCULATE");
		lblNewLabel_5.setBounds(190, 6, 130, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		textresults = new JTextField();
		textresults.setBounds(284, 41, 124, 120);
		frame.getContentPane().add(textresults);
		textresults.setColumns(10);
	}
}
