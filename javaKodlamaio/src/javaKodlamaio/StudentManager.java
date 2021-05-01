package javaKodlamaio;

public class StudentManager extends UserManager {
     public void add(Student student) {
    	 System.out.println(student.getFirstName() +" "+ student.getLastName() +" "+  student.getStudentNumber() + " " + "Numaralı Öğrenci Eklendi");
     }
}
