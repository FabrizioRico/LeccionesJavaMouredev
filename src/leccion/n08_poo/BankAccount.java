/*
 * BankAccount
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 11 feb. 2026
 */

package leccion.n08_poo;

public class BankAccount {
	
	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double newDeposit(double amount) {
		return amount + balance;
	}
}
