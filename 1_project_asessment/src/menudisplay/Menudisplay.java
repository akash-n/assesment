package menudisplay;
import java.util.*;
import ascending.Ascending_sorting;
import operation.Operation_classperformed;


public class Menudisplay {
	static Scanner sn=new Scanner(System.in);
 public static void details() {
	 System.out.println("Menu display");
	 System.out.println("vishnu");
	 System.out.println("employee id:2527463");
	 System.out.println(" accept the user input to select operations as per the requirement");
	 		
 }public static void main() {
	 System.out.println("/nMENU DISPLAY");
	 System.out.println(" 1-show file in Ascending Order");
				System.out.println(" 2-to view file operations");
				System.out.println(" 3-to Exit from the application");
				System.out.println("press the required function listed to carry out further steps");
				
				int choice = sn.nextInt();
				handle(choice);
 }
 public static void handle(int value) {
	 switch(value)
	 {case 1:
		 Ascending_sorting. ascendingvalues();
			break;
		case 2:
			Operation_classperformed .FileOperations();
			break;
		case 3:
			System.out.println("Exit");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid input");
	 
 }main();}
 public static void main(String[] args) {
	 details();
	 main();
 }
}
