

// Class
public class Student {
	
	// Attributes
	
		    String studentNumber;
			String studentName;
			float  milestone1;
			float  milestone2;
			float  milestone3;
			float  averageGrade;
	
    // getter and setter methods
			
	//getter methods
		    public String getstudentNumber() {
		    	return studentNumber;
		    }
		    public String getstudenName() {
		    	return studentName;
		    }

		    public String getMilestone1() {
		    	return String.valueOf(milestone1);
		    }
		    
		    public String getMilestone2() {
		    	return String.valueOf(milestone2);
		    }
		    public String getMilestone3() {
		    	return String.valueOf(milestone3);
		    }
		    public String getaverageGrade() {
		    	return String.valueOf(averageGrade);
		    }
		    
    // setter methods
		    public void setStudentNumber(String studNumber) {
		    	studentNumber = studNumber; 
		    }
		    
		    public void setStudentName(String studName) {
		    	studentName = studName; 
		    }
		    
		    public void setMilestones1(float m1) {
		    	milestone1= m1;
		    }
		    
		    public void setMilestones2(float m2) {
		    	milestone2= m2;
		    }
		    public void setMilestones3(float m3) {
		    	milestone1= m3;
		    }
		    
    //methods
		    public float computeAverage() {
		    	averageGrade = (milestone1 + milestone2 + milestone3) /3;
		    	return averageGrade;
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	public static void main(String[] args) {
	
		
		

	}

}
