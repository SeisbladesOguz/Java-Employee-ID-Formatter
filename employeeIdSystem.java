package employee;
import java.util.Scanner;
public class employeeIdSystem {
	public static void main (String[] args) {
		Scanner in =  new Scanner (System.in);
		
		System.out.println("Please enter worker's name: ");
		String workerName = in.next();
		
		
		String result = employeeId(6,1234);
		
		System.out.print("Employee's Name: " + workerName +" "+ "EmployeeId: "+ result );
		in.close();
		
	}public static String employeeId (int totalWidth , int workerNumber) {
		
		String s = "" + workerNumber;
		int currentSize = s.length();		
		String resultId = "";
		
		while(currentSize < totalWidth) {
			s = "0" + s;
			currentSize = s.length();
			
		}
		resultId = "EMP-" + s;
		
		if(currentSize > totalWidth) {
			String newCurrentId = "WARN-" +s;
			return newCurrentId;
		
		}
		return resultId;
		
		
	}
     
}
