package factory;

import entities.Finance;

public class FinanceFactory {
	
	public static Finance createNewFinance() {
		return new Finance(10000.0, 2000.0, 80);
	}

}
