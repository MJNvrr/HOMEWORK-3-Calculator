package MotorPhEmployeeApp;

public class Employee {
	public static void main(String[] args) {
		
	       
	}
	
	        public int employeeNumber;
	        public String name;
	        public String address;
	        public String jobTitle;	
	
	
	        public void employee (int employeeNumber, String name, String address,String jobTitle) {
	               this.employeeNumber = employeeNumber;
	               this.name = name;
	               this.address = address;
	               this.jobTitle = jobTitle; 
              
	        }
	        
            public int getemployeeNumber() {
            	   return employeeNumber; 
            }
	        
            public String getname() {
            	   return name;
            	   
            }
            
            public String getaddress() {
            	   return address;
            	   
            }
            
            public String getjobTitle() {
            	   return jobTitle; 
            }
            
            
            
            public String Attendance;
                   int daysPresent;
                   int daysAbsent;
            
            public void Attendance (int daysPresent, int daysAbsent) {
            	   this.daysAbsent = daysPresent;
            	   this.daysAbsent =  daysAbsent;
            	   
            }
            
            public int getdaysPresent() {
            	   return daysPresent;
            } 	   
           
            public int getdaysAbsent() {
            	   return daysAbsent;
            }
                   
            
            
            public String Benefits; 
                    int RiceSubcidy;
                    int PhoneAllowance;
                    int ClothingAllowance;
                    
            public  void Benefits (int RiceSubcidy, int PhoneAllowance, int ClothingAllowance) {  
            	    this.RiceSubcidy = RiceSubcidy;
            	    this.PhoneAllowance = PhoneAllowance;
            	    this.ClothingAllowance = ClothingAllowance;
            	    
             }
            public int getRiceSubcidy() {
                   return RiceSubcidy;
             }       
            public int getPhoneAllowance() {
            	   return PhoneAllowance;
            
            }
            public int getClothingAllowance() {
            	   return ClothingAllowance;
            }
            
            public int Deduction;
                   
                   double SSS;
                   double PhilHealth;
                   double Pagibig;
                   double Tax;
                   
                   
             public void Deduction (double SSS, double PhilHealth, double Pagibig, double Tax) {
            	   this.SSS = SSS;
            	   this.PhilHealth = PhilHealth;
            	   this.Pagibig = Pagibig;
            	   this.Tax = Tax;
            	   
             }
             public double getSSS() {
            	    return SSS;
            	   
 
             }
             public double getPhilHealth () {
            	    return PhilHealth;
            	   
             }
             public double getPagibig () {
            	    return Pagibig;
             }
             public double getTax () {
            	    return Tax;
             }
            
   }




