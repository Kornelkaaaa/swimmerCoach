import java.util.Scanner;

public class swimCoachDriver {

	public static void main(String[] args) {
		//scanner implementation
		Scanner kbd = new Scanner(System.in);
		System.out.print("Wpisz imie zawodnika: ");
		String name = kbd.next();
		System.out.print("Wpisz wiek zawodnika: ");
		int age = kbd.nextInt();
		System.out.println(name + " "+ age);
		switch (age) {
		case 14:
		case 15:
			System.out.println(name+ " dla tego zawodnika zalecane jest 8 jednostek trenigowych.");
			break;
		case 16:
		case 17:
			System.out.println(name+ " dla tego zawodnika zalecane jest 11 jednostek trenigowych.");
			break;
		case 18:
			System.out.println(name+ " dla tego zawodnika zalecane jest 12 jednostek trenigowych.");
			break;
		case 19:
			System.out.println(name+ " dla tego zawodnika zalecane jest 13 jednostek trenigowych.");
			break;
		default:
			if (age > 20 && age < 25) 
			{
				System.out.println(name+ " dla tego zawodnika zalecane jest 14 jednostek trenigowych.");
			}
			else
			{
				System.out.println("Ten program jest przeznaczony dla zawodnikow od 14 do 25 lat ");
			}
			break;
			
		};
		
		kbd.close();
	}

}
