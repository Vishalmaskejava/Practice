import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.Student;

public class Start {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Wellcome !!!!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("Press 1 to ADD students");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display students");
			System.out.println("Press 4 to exit the app");
			int choice = Integer.parseInt(br.readLine());
			
			if(choice==1) {
				//Add student
				System.out.println("Enter Student Name");
				String name = br.readLine();
				System.out.println("Enter Student phone number");
				String phone = br.readLine();
				System.out.println("Enter Student city");
				String city = br.readLine();
				
				Student st = new Student(name,phone,city);
				boolean answer = PerformOperations.InsertStudentIntoDB(st);
				
				
				if(answer) {
					System.out.println("Student is successfully added");
				}else {
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				
			}else if(choice==2) {
				
				//delete student
			}else if(choice==3) {
				//Display students
			}else if(choice==4){
				break;
			}else {
				
			}
		}
		System.out.println("Thank you !!!!");
	}

}
