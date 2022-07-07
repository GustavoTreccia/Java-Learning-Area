package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
/* NÃO É TDD */
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount(){
		
		double expectedValue = 100.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		double amount = -204.0;
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}
	
	@Test
	public void fullWithdrawShouldClearBalance() {
		double expectedValue = 0.0;
		double expectedResult = 200.0;
		Account acc = AccountFactory.createAccount(200.0);
		
		double result = acc.fullWithdraw();
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		Assertions.assertTrue(expectedResult == result);
		
	}
	
	@Test
	public void withdrawShouldDecreaseBalanceWhenSufficientBalance() {
		double expectedValue = 150.0;
		Account acc = AccountFactory.createAccount(200.0);
		acc.withdraw(50.0);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
		
	}
	
	@Test
	public void withdrawShouldThrowException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Account acc = AccountFactory.createAccount(200.0);
			acc.withdraw(500.0);
		});
	}
}

/* Sobre TDD:
 * - Teria primeiramente o teste
 * - Em seguida construir a lógica por trás dos testes 
*/