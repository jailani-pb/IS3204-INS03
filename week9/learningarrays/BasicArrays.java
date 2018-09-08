package week9.learningarrays;

public class BasicArrays {

	public static void main(String[] args) {
		String[] students = new String[5];
		// Assigning value in to Array
		students[1] = "Jailani";
		students[0] = "Mohammad";
		students[2] = "Haji";
		students[4] = "Rahman";
		students[3] = "Abdul";
		// Since size is 5, final index will be 4.
		// Assigning value to index 5 will produce error.
//		students[5] = "Aji";
		
		System.out.println(students[1]);
		System.out.println(students[0]);
		
		students[0] = "Mohd";
		System.out.println(students[0]);
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for(String student : students) {
			System.out.println(student);
		}
		
		int[] studentsAge = {18, 20, 19, 18, 21};
		
		studentsAge[2] = 23;
		
		for(int age : studentsAge) {
			System.out.println(age);
		}
	}
	
}



