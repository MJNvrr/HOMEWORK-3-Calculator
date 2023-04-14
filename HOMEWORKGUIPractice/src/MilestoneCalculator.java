import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MilestoneCalculator implements ActionListener  {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		
		
		// Frame Settings
		JFrame frame = new JFrame();
		
		frame.setSize(500,300); // Dimensions
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Milestone Calculator");
		frame.add(panel);
		
		
		
		
		// Label Settings
		
		JLabel milestone1 = new JLabel("Milestone 1 (25%):");
		milestone1.setBounds(50, 30, 150, 30);
        panel.add(milestone1);
        
        JLabel milestone2 = new JLabel("Milestone 2 (40%):");
		milestone2.setBounds(50, 70, 150, 30);
        panel.add(milestone2);
		
        JLabel milestone3 = new JLabel("Milestone 3 (35%):");
		milestone3.setBounds(50, 110, 150, 30);
        panel.add(milestone3);
        
        JLabel finalGrade = new JLabel("Final Grade:");
		finalGrade.setBounds(50, 150, 150, 30);
        panel.add(finalGrade);
        
        
     // TextField Settings
		
        JTextField milestone1Text = new JTextField();
		milestone1Text.setBounds(200, 30, 130, 30);
		panel.add(milestone1Text);
		
		JTextField milestone2Text = new JTextField();
		milestone2Text.setBounds(200, 70, 130, 30);
		panel.add(milestone2Text);
		
		JTextField milestone3Text = new JTextField();
		milestone3Text.setBounds(200, 110, 130, 30);
		panel.add(milestone3Text);
		
		JTextField finalGradeText = new JTextField();
		finalGradeText.setBounds(200, 150, 130, 30);
		panel.add(finalGradeText);
		
								
		
		// Button Settings
		
		JButton button = new JButton("Calculate");
		button.setBounds(215, 200, 100, 25);
		button.addActionListener(new MilestoneCalculator()) ;
		panel.add(button);
				
				
				
				
				// Frame will be Visible
				

				frame.setVisible(true);  
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
		
			}
}
	
			