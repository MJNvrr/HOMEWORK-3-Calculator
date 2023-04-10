import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeeAPP implements ActionListener  {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel employeeNolabel = new JLabel("Employee No:");
        employeeNolabel.setBounds(10, 20, 100, 30);
        panel.add(employeeNolabel);
		
		
		JLabel firstNamelabel = new JLabel("First Name:");
		firstNamelabel.setBounds(10, 50, 100, 25);
		panel.add(firstNamelabel);
		
		JLabel lastNamelabel = new JLabel("Last Name:");
		lastNamelabel.setBounds(10, 80, 100, 25);
		panel.add(lastNamelabel);
		
		JLabel emaillabel = new JLabel("Email:");
		emaillabel.setBounds(10, 110, 100, 25);
		panel.add(emaillabel);
		
		JLabel addresslabel = new JLabel("Address:");
		addresslabel.setBounds(10, 140, 100, 25);
		panel.add(addresslabel);
		
		JLabel jobTitlelabel = new JLabel("Jobtitle:");
		jobTitlelabel.setBounds(10, 170, 100, 25);
		panel.add(jobTitlelabel);
		
				
		JTextField employeeText = new JTextField();
		employeeText.setBounds(100, 20, 165, 30);
		panel.add(employeeText);
		
		JTextField firstNameText = new JTextField();
		firstNameText.setBounds(100, 50, 165, 30);
		panel.add(firstNameText);
		
		JTextField lastNameText = new JTextField();
		lastNameText.setBounds(100, 80, 165, 30);
		panel.add(lastNameText);
		
		JTextField emailText = new JTextField();
		emailText.setBounds(100, 110, 165, 30);
		panel.add(emailText);
		
		JTextField addressText = new JTextField();
		addressText.setBounds(100, 140, 165, 30);
		panel.add(addressText);
		
		JTextField jobTitleText = new JTextField();
		jobTitleText.setBounds(100, 170, 165, 30);
		panel.add(jobTitleText);
		
		
		
		
		
		JButton button = new JButton("Enter");
		button.setBounds(130, 400, 100, 25);
		button.addActionListener(new EmployeeAPP()) ;
		panel.add(button);
		
		JLabel success = new JLabel ("");
		success.setBounds(150, 500, 100, 25);
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
