import java.util.Scanner;

public class swimCoachDriver {

	public static void main(String[] args) {
		//scanner implementation
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Enter the swimmer's first name: ");
		String name = kbd.next();
		
		System.out.print("Enter the swimmer's last name: ");
		String lastName = kbd.next();
		
		System.out.print("Enter the swimmer's age: ");
		int age = kbd.nextInt();
		
		Swimmer swimmer = new Swimmer(name, lastName, age);
		
		System.out.println(swimmer.toString());
		
		kbd.close();
	}

}
