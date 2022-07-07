package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Finance;
import factory.FinanceFactory;


public class FinanceTest {
	
	@Test
	public void creationShouldBuildWithCorrectData() {
		Finance f = FinanceFactory.createNewFinance();
		
		Assertions.assertEquals(10000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());

	}
	
	@Test
	public void creationShouldThrowIllegalArgumentWhenDataNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Finance f = new Finance(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTAShouldRefreshValueWhenDataIsValid() {
		Finance f = FinanceFactory.createNewFinance();
		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());

	}
	
	@Test
	public void setTAShouldThrowIllegalArgumentWhenDataIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Finance f = new Finance(100000.0, 2000.0, 20);
			f.setTotalAmount(1000.0);
		});
	}
	
	@Test
	public void setIncomeShouldRefreshValueWhenDataIsValid() {
		Finance f = FinanceFactory.createNewFinance();
		f.setIncome(4000.0);
		
		Assertions.assertEquals(10000.0, f.getTotalAmount());
		Assertions.assertEquals(4000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentWhenDataIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Finance f = FinanceFactory.createNewFinance();
			f.setTotalAmount(150000.0);
		});
	}

	@Test
	public void setMonthsShouldRefreshValueWhenDataIsValid() {
		Finance f = FinanceFactory.createNewFinance();
		f.setMonths(60);
		
		Assertions.assertEquals(10000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(60, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentWhenDataIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Finance f = FinanceFactory.createNewFinance();
			f.setMonths(4);
		});
	}
	
	@Test
	public void entryShouldReturnCorrectCalculation() {
		double expectedValue = 2000.0;
		Finance f = FinanceFactory.createNewFinance();
		f.entry();
		
		Assertions.assertEquals(expectedValue, f.entry());
	}
	
	@Test
	public void quotaShouldReturnCorrectQuota() {
		double expectedValue = 100.0;
		Finance f = FinanceFactory.createNewFinance();
		f.quota();
		
		Assertions.assertEquals(expectedValue, f.quota());
	}

}
