package javaKodlamaio;

public class Main {

	public static void main(String[] args) {
		
		
		User user1 =new User();
		user1.setId(1);
		user1.setFirstName("Sonnur");
		user1.setLastName("Tayfuroğlu");
		user1.setEmail("sonnur.io@gmail.com");
		user1.setPassword("36987");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("DEMİROĞ");
		instructor1.setTrainingBranch("Java & React");
		instructor1.setEmail("engindemiog@io.com");
		instructor1.setPassword("456123");
		
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Sonnur");
		student1.setLastName("Tayfuroğlu");
		student1.setStudentNumber(132);
		student1.setEmail("tayfurnur@gmail.com");
		student1.setPassword("96321");
		
		
		UserManager userManager =new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.add(user1);
		instructorManager.add(instructor1);
		studentManager.add(student1);
		

	}

}
