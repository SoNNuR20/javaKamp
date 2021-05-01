package javaKodlamaio;

public class Instructor extends User{
     
	private int instructorNumber;
	private String trainingBranch;
	
	public Instructor() {
		
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getTrainingBranch() {
		return trainingBranch;
	}

	public void setTrainingBranch(String trainingBranch) {
		this.trainingBranch = trainingBranch;
	}
	
	
}
