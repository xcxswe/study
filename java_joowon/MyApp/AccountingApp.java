
public class AccountingApp {

	public static void main(String[] args) {
	
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expanseRate = 0.3;
		double VAT = valueOfSupply*vatRate;
		double Total = valueOfSupply + VAT;
		double Expanse = valueOfSupply*expanseRate;
		double Income = valueOfSupply - Expanse;
		double Dividend1 = Income*0.5;
		double Dividend2 = Income*0.3;
		double Dividend3 = Income*0.2;
		
		System.out.println("Value of supply : "+valueOfSupply);		
		System.out.println("VAT : "+VAT);		
		System.out.println("Total : "+Total);		
		System.out.println("Expanse : "+Expanse);	
		System.out.println("Income : "+Income);		
		System.out.println("Dividend1 : "+Dividend1);
		System.out.println("Dividend2 : "+Dividend2);		
		System.out.println("Dividend3 : "+Dividend3);
	}

}
