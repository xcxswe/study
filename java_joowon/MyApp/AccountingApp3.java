public class AccountingApp3 {

	public static double valueOfSupply;
	public static double vatRate;
	public static double ExpenseRate;

	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		ExpenseRate = 0.3;

		print();

		double[] dividendRate = new double[3];
		dividendRate[0] = 0.5;
		dividendRate[1] = 0.3;
		dividendRate[2] = 0.2;

		int i = 0;
		while (i < dividendRate.length) {
			System.out.println("dividend : " + getIncome() * dividendRate[i]);
			i = i + 1;
		}
	}

	public static void print() {
		System.out.println("valueOfSupply : " + valueOfSupply);
		System.out.println("vat : " + getVAT());
		System.out.println("total : " + getTotal());
		System.out.println("expense : " + getExpense());
		System.out.println("income : " + getIncome());
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * ExpenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
