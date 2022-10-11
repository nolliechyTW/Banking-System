package banking;

/**
 * Representing a checking/saving bank account for a customer.
 * author @nolliechen
 **/

public class BankAccount {

		//instance vars
		/**
		 * Type of account (checking/ saving)
		 **/
		String accountType;

		/**
		 * Balance for bank account
		 **/
		double balance;

		/**
		 * Customer for this account
		 **/
		Customer customer;

		//constructor


		/**
		 * Create a bank account of given type for given customer
 		 * @param accountType for bank account
    		 * @param customer for bank account
		 **/
		public BankAccount(String accountType, Customer customer) {
			this.accountType = accountType;
			this.customer = customer;
		}

		//method

		/**
		 * Deposit/withdraw the given amount
     		 * @param amount to add/reduce to balance
		 * @throws Exception if given amount is larger than available balance
		 **/
		public void deposit(double amount) {
			this.balance += amount;
		}

		public void withdraw(double amount) throws Exception {
			if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance."); 
			//Exception is a built-in class, which indicates that a problem occurred.
			}
			this.balance -= amount;
		}


		/**
		 * return account type and balance for this bank account
    		 * @return string with all the info
		 **/
		public String getAccountInfo() {
			return this.accounType +": " + this.balance;
		}

		/**
		 * return the customer name and address for this bank account
    		 * @return string with all the info
		 **/

		public String getCustomerInfo() {
			return this.customer.getName +" from " + this.customer.getAddress;
		}

} 
