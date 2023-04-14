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
		panel.setLayout(null);
		
		
		
		// Frame Settings
		JFrame frame = new JFrame();
		
		frame.setSize(750, 500); // Dimensions
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MotorPH Employee APP");
		frame.add(panel);
		
		
		
		
		// Label Settings
		
		JLabel employeeNolabel = new JLabel("Employee No:");
        employeeNolabel.setBounds(10, 25, 100, 30);
        panel.add(employeeNolabel);
		
		
		JLabel firstNamelabel = new JLabel("First Name:");
		firstNamelabel.setBounds(10, 60, 100, 25);
		panel.add(firstNamelabel);
		
		JLabel lastNamelabel = new JLabel("Last Name:");
		lastNamelabel.setBounds(10, 90, 100, 25);
		panel.add(lastNamelabel);
		
		JLabel emaillabel = new JLabel("Email:");
		emaillabel.setBounds(10, 120, 100, 25);
		panel.add(emaillabel);
		
		JLabel addresslabel = new JLabel("Address:");
		addresslabel.setBounds(10, 150, 100, 25);
		panel.add(addresslabel);
		
		JLabel jobTitlelabel = new JLabel("Jobtitle:");
		jobTitlelabel.setBounds(10, 180, 100, 25);
		panel.add(jobTitlelabel);
		
		JLabel benefitslabel = new JLabel("Benefits");
		benefitslabel.setBounds(400, 20, 100, 30);
		panel.add(benefitslabel);
		
		
		JLabel riceSubsidylabel = new JLabel("Rice Subsidy:");
		riceSubsidylabel.setBounds(400, 60, 100, 30);
		panel.add(riceSubsidylabel);
		
		
		JLabel phoneAllowancelabel = new JLabel("Phone Allowance:");
		phoneAllowancelabel.setBounds(400, 90, 110, 25);
		panel.add(phoneAllowancelabel);
		
		
		JLabel clothingAllowancelabel = new JLabel("Clothing Allowance:");
		clothingAllowancelabel.setBounds(400, 120, 120, 25);
		panel.add(clothingAllowancelabel);
		
		
		JLabel salarylabel = new JLabel("Salary");
		salarylabel.setBounds(400, 150, 100, 30);
		panel.add(salarylabel);
		
		JLabel netPaylabel = new JLabel("Net Pay:");
		netPaylabel.setBounds(400, 180, 100, 30);
		panel.add(netPaylabel);
		
		
		JLabel attendancelabel = new JLabel("Attendance");
		attendancelabel.setBounds(10, 220, 100, 25);
		panel.add(attendancelabel);
		
		JLabel totalWorkHourslabel = new JLabel("Hours Worked:");
		totalWorkHourslabel.setBounds(10, 260, 100, 25);
		panel.add(totalWorkHourslabel);

		JLabel ratePerHourlabel = new JLabel("Rate/Hour:");
		ratePerHourlabel.setBounds(10, 290, 100, 25);
		panel.add(ratePerHourlabel);

		
		JLabel grossPaylabel = new JLabel("Gross Pay:");
		grossPaylabel.setBounds(10, 320, 100, 25);
		panel.add(grossPaylabel);
		
				
		JLabel deductionlabel = new JLabel("Deductions");
		deductionlabel.setBounds(400, 220, 100, 30);
		panel.add(deductionlabel);
		
		JLabel ssslabel = new JLabel("SSS:");
		ssslabel.setBounds(400, 260, 100, 30);
		panel.add(ssslabel);
		
		JLabel pagIbiglabel = new JLabel("Pag Ibig:");
		pagIbiglabel.setBounds(400, 290, 100, 30);
		panel.add(pagIbiglabel);
		
		JLabel philHealthlabel = new JLabel("PhilHealth:");
		philHealthlabel.setBounds(400, 320, 100, 30);
		panel.add(philHealthlabel);
		
		
		JLabel incomeTaxlabel = new JLabel("Income Tax:");
		incomeTaxlabel.setBounds(400, 348, 100, 30);
		panel.add(incomeTaxlabel);
		
		
		
		// TextField Settings
				
		JTextField employeeNOText = new JTextField();
		employeeNOText.setBounds(110, 20, 165, 30);
		panel.add(employeeNOText);
		
		JTextField firstNameText = new JTextField();
		firstNameText.setBounds(110, 50, 165, 30);
		panel.add(firstNameText);
		
		JTextField lastNameText = new JTextField();
		lastNameText.setBounds(110, 80, 165, 30);
		panel.add(lastNameText);
		
		JTextField emailText = new JTextField();
		emailText.setBounds(110, 110, 165, 30);
		panel.add(emailText);
		
		JTextField addressText = new JTextField();
		addressText.setBounds(110, 140, 165, 30);
		panel.add(addressText);
		
		JTextField jobTitleText = new JTextField();
		jobTitleText.setBounds(110, 170, 165, 30);
		panel.add(jobTitleText);
		
		
		JTextField riceSubcidyText = new JTextField();
		riceSubcidyText.setBounds(520, 50, 165, 30);
		panel.add(riceSubcidyText);
		
		
		JTextField phoneAllowanceText = new JTextField();
		phoneAllowanceText.setBounds(520, 80, 165, 30);
		panel.add(phoneAllowanceText);
		
		JTextField clothingAllowanceText = new JTextField();
		clothingAllowanceText.setBounds(520, 110, 165, 30);
		panel.add(clothingAllowanceText);
		
		JTextField netPayText = new JTextField();
		netPayText.setBounds(520, 175, 165, 30);
		panel.add(netPayText);
		
		
		JTextField hoursWorkedText = new JTextField();
		hoursWorkedText.setBounds(110, 250, 165, 30);
		panel.add(hoursWorkedText);
		
		JTextField ratePerHourText = new JTextField();
		ratePerHourText.setBounds(110, 280, 165, 30);
		panel.add(ratePerHourText);
		
		JTextField grossPayText = new JTextField();
		grossPayText.setBounds(110, 310, 165, 30);
		panel.add(grossPayText);
		
		JTextField sssText = new JTextField();
		sssText.setBounds(520, 250, 165, 30);
		panel.add(sssText);
		
		JTextField pagIbigText = new JTextField();
		pagIbigText.setBounds(520, 280, 165, 30);
		panel.add(pagIbigText);
		
		JTextField philHealthText = new JTextField();
		philHealthText.setBounds(520, 310, 165, 30);
		panel.add(philHealthText);
		
	
		JTextField incomeTaxText = new JTextField();
		incomeTaxText.setBounds(520, 340, 165, 30);
		panel.add(incomeTaxText);
		
		
			
				
		// Button Settings
		
		JButton button = new JButton("Enter");
		button.setBounds(300, 400, 100, 25);
		button.addActionListener(new EmployeeAPP()) ;
		panel.add(button);
		
		
		
		
		// Frame will be Visible
		

		frame.setVisible(true);  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
