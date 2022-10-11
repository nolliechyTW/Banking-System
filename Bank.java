/* 
 * Represent a bank for managing customers and their bank accounts
 * @author nolliechen
 */

package banking;
import java.util.Scanner;

public class Bank {

		public static void main(String[] args) {
			//create new instance of Bank class
			Bank bank = new bank();
				
			//calls the run method in the bank class
			bank.run();
		}
	
		/* 
		 * Run the program by initializing and managing, bank accounts and customers
		 * Declaration order of methods does not matter
      		 */
		public void run() {
			System.out.println("Welcome to the bank. What is your name? ");
		    
		   	 //Create scanner to get user input
			Scanner scanner = new scanner(System.in);
			//get the next token 
			String name = scanner.next();
				
			System.out.println("Hello" + name +"! We are creating account for you.");

			//a constructor is called automatically when a new instance of an object is created
			//create customer with given name			
			Customer customer = new Customer(name);

			//get address
			System.out.println("What's your address? ");
			String address = Scanner.next();

			//set the customers' address
			customer.setAddress(address);

			//create a checking account for a customer
			BankAccount checkingAcoount = new BankAccount("checking", customer);

			//create a savings account for a customer	    
			BankAccoung savingAccount = new BankAccount("savings", customer);
			
        		//get and print the customer info associated with the checking account
			System.out.println();
			System.out.println("Customer info: ");
			System.out.println(checkingAccount.getCustomerInfo());

			System.out.println("Checking account: ");
			System.out.println(checkingAccount.getAccountInfo());
			System.out.println("Savings account: ");
			System.out.println(savingAccount.getAccountInfo());

			//deposits

       			//into checking
			System.out.println();
			System.out.println("Amount (decimal) to deposit into your checking account: ");
			double amount = scanner.nextDouble();
			checkingAccount.deposit(amount); //deposit into checking account

			//into savings
			System.out.println();
			System.out.println("Amount (decimal) to deposit into your savings account: ");
			amount = scanner.nextDouble();
			savingsAccount.deposit(amount); //deposit into savings account
				
			//print new balances
			System.out.println(checkingAccount.getAccountInfo());
			System.out.println(savingsAccount.getAccountInfo());

			//withdraw from checking
			System.out.println();
			System.out.println("Amount (decimal) to withdraw from your checking account: ");
			amount = scanner.nextDouble(); // get next token as a double
				
			try {
				checkingAccount.withdraw(amount);  
				//withdraw from checking
			     } catch (Exception e) { 
					//e is a variable representing the exception
					//e.printStackTrace() 
					//the built-in method prints the entire error messages 
					System.out.println(e.getMessage()); 
					//the method prints customized messages
				}

			//withdraw from savings
			System.out.println();
			System.out.println("Amount (decimal) to withdraw from your savings account: ");
			amount = scanner.nextDouble(); // get next token as a double
				
			try {
				savingsAccount.withdraw(amount);  
				//withdraw from savings
				} catch (Exception e) { 
					//e is a variable representing the exception
					//e.printStackTrace() 
					//the built-in method prints the entire error messages 
					System.out.println(e.getMessage()); 
					//the method prints customized messages
				}

			//print new balances
			System.out.println(checkingAccount.getAccountInfo());
			System.out.println(savingsAccount.getAccountInfo());

			scanner.close();
  }
}
