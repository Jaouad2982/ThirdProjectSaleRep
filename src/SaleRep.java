import java.util.Scanner;

public class SaleRep {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String repeat;
		// creation of an object
		SaleClass sale = new SaleClass();
		do {
			getSale(sale);
			choices();
			int option = input.nextInt();
			// switch the user choice and decide where to go according to the user's input
			switch (option) {
			case 1:
				System.out.println("The customer's name is " + sale.getName());
				break;
			case 2:
				System.out.println("The customer's number is " + sale.getNumber());
				break;
			case 3:
				System.out.println("The customers salesAmount witout taxes is " + sale.getSalesAmount());
				break;
			case 4:
				System.out.println("The customers tax is " + sale.getTax());
				break;
			case 5:
				System.out.println(sale.toString());
				break;
			case 6:
				System.out.println("Enter the tax code");
				int taxCode = input.nextInt();
				System.out.println("The amount plus taxes is: " + sale.calculate(taxCode));
				break;
			default:
				System.out.println("Wrong Input, plz try again");
				break;

			}
			System.out.println("Would you like to repeat");
			input.nextLine();
			repeat = input.nextLine();

		} while (repeat.startsWith("y"));
		System.out.println("Thanks for using this app, Have  a good day");
	}
// A method to get the user choices 1 or 2 or 3 or 4 or 5 or 6 
	public static void choices() {
		System.out.println("Enter 1 to see  the customer's name ");
		System.out.println("Enter 2 to check the customer's number");
		System.out.println("Enter 3 to check the sales amount");
		System.out.println("Emter 4 to check the tax amount");
		System.out.println("Enter 5 to check all the info at once");
		System.out.println("Enter 6 to see the calculated amount with taxes");
	}
// A method to get the user info name number amount and taxe
	public static SaleClass getSale(SaleClass s) {

		System.out.println("Enter the customer's name");
		String name = input.nextLine();
		s.setName(name);

		System.out.println("Enter the customer's number");
		String number = input.nextLine();
		s.setNumber(number);

		System.out.println("Enter the sales amount");
		double saless = input.nextInt();
		s.setSalesAmount(saless);

		System.out.println("Enter the tax amount");
		int taxe = input.nextInt();
		s.setTax(taxe);
		return s;
	}

}
