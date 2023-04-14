import java.util.Scanner;


public class EmployeeHourlyRate {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
             
        
        System.out.print("Enter the employee number: ");
        int employeeNumber = scanner.nextInt();

        double hourlyRate;
        switch (employeeNumber) {
            case 10001:
                hourlyRate = 373.04;
                break;
            case 10002:
                hourlyRate = 255.80;
                break;
            case 10003:
                hourlyRate = 255.80;
                break;
            case 10004:
                hourlyRate = 362.05;
                break;
            case 10005:
                hourlyRate = 133.93;
                break;
            case 10006:
                hourlyRate = 133.93;
                break;
            case 10007:
                hourlyRate = 142.86;
                break;
            case 10008:
                hourlyRate = 142.86;
                break;
            case 10009:
                hourlyRate = 133.93;
                break;
            case 10010:
                hourlyRate = 133.93;
                break;
            case 10011:
                hourlyRate = 229.02;
                break;
            case 10012:
                hourlyRate = 249.11;
                break;
            case 10013:
                hourlyRate = 377.98;
                break;
            case 10014:
                hourlyRate = 138.39;
                break;
            case 10015:
                hourlyRate = 138.39;
                break;
            case 10016:
                hourlyRate = 142.86;
                break;
            case 10017:
                hourlyRate = 133.93;
                break;
            case 10018:
                hourlyRate = 133.93;
                break;
            case 10019:
                hourlyRate = 142.86;
                break;
            case 10020:
                hourlyRate = 147.32;
                break;
            case 10021:
                hourlyRate = 147.32;
                break;
            case 10022:
                hourlyRate = 142.86;
                break;
            case 10023:
                hourlyRate = 133.93;
                break;
            case 10024:
                hourlyRate = 133.93;
                break;
            case 10025:
                hourlyRate = 133.93;
                break;
           
            default:
                System.out.println("Employee not found!");
                return;
        }

        System.out.print("Worked Hours:");
        double hoursWorked = scanner.nextDouble();

        double grossPay = hourlyRate * hoursWorked;
        double BIRtax = grossPay * 0.20;
        double sssContribution = grossPay *.045;
        double pagIbigContribution = 100.0;
        double philHealthContribution =275.0 ;
        double totalDeductions = sssContribution + pagIbigContribution + philHealthContribution;
        double monthlySalary = grossPay - totalDeductions - BIRtax;
        double monthlySalaryWithDeductions = grossPay - BIRtax ;
        double netPAy = grossPay - BIRtax;
        
        if (grossPay < 20832) {
            BIRtax = 0.0; // No piste 
        }  
        /*if (netWeeklySalary < 3250) {
            sssContribution = 135; // No piste 
           
        }
        if (netWeeklySalary < 3250) {
            sssContribution = 135; // No piste 
           
        }**/
     
     
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("SSS Contribution " + sssContribution);
        System.out.println("PagIbig " + pagIbigContribution);
        System.out.println("PhilHealth " + philHealthContribution); 
        System.out.println("Gross PAy : " + grossPay);
        System.out.println("BIR Tax " + BIRtax);
        System.out.println("Net Pay: " + netPAy);
    
	
	}
		
	}


