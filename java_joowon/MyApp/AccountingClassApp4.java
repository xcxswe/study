class Account {
	public double valueOfSupply;
	public double vatRate;
	public double ExpenseRate;

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * ExpenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatRate;
	}

	public void print() {
		System.out.println("valueOfSupply : " + valueOfSupply);
		System.out.println("vat : " + getVAT());
		System.out.println("total : " + getTotal());
		System.out.println("expense : " + getExpense());
		System.out.println("income : " + getIncome());
	}

	public double[] getDividendRate() {
		double[] dividendRate = new double[3];
		dividendRate[0] = 0.5;
		dividendRate[1] = 0.3;
		dividendRate[2] = 0.2;
		return dividendRate;
	}

}

public class AccountingClassApp4 {
	public static void main(String[] args) {

		Account a1 = new Account();

		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.ExpenseRate = 0.3;
		a1.print();
		a1.getDividendRate();

		int i = 0;
		while (i < a1.getDividendRate().length) {
			System.out.println("dividend : " + a1.getIncome() * a1.getDividendRate()[i]);
			i = i + 1;
		}

		Account a2 = new Account();

		a2.valueOfSupply = 50000.0;
		a2.vatRate = 0.1;
		a2.ExpenseRate = 0.3;
		a2.print();
		a2.getDividendRate();

		i = 0;
		while (i < a2.getDividendRate().length) {
			System.out.println("dividend : " + a2.getIncome() * a2.getDividendRate()[i]);
			i = i + 1;
		}

	}
}
