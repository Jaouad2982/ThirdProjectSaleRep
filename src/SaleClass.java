
public class SaleClass {

	private String name;
	private String number;
	private double salesAmount;
	private double tax;
	private double salesPlusTaxes;

	public SaleClass() {
		name = " ";
		number = " ";
		salesAmount = 0;
		tax = 0;
		salesPlusTaxes=0;
	}

	public void setName(String newName) {
		name = newName;

	}

	public String getName() {
		return name;
	}

	public void setNumber(String myNumber) {
		number = myNumber;
	}

	public String getNumber() {
		return number;
	}

	public void setSalesAmount(double saless) {
		salesAmount = saless;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setTax(int newTax) {
		tax = newTax;
	}

	public double getTax() {
		return tax;
	}

	public double calculate(int taxCode) {
		if(taxCode==0){
			System.out.println("You are exempt from paying taxes");
		}else if(taxCode==1){
				tax=0.03*salesAmount;
		 salesPlusTaxes = tax + salesAmount;}
		else if(taxCode==2){
			tax=0.05*salesAmount;
		 salesPlusTaxes = tax + salesAmount;
		}
		return salesPlusTaxes;

	}

	public String toString() {
		return "name : " + getName() + "\n" + "number : " + getNumber() + "\n" + "sales Amount : " + getSalesAmount()
				+ "\n" + "tax : " + getTax() ;
	}

}
