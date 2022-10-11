package banking;
/**
 * Representing a customer of a bank
 * author @nolliechen
 **/

public class Customer {
		//instances vars

		/**
		 * Name of a customer
		 **/
		String name;

		/**
		 * Address of a customer
		 **/
		String address;

		//constructor, no return type before the name
		//if you don't declare a constructor, Java will automatically 
		//create one for you with no parameter
  
		/**
		 * Create a customer with a given name
		 * @param name of customer
		 **/
		public Customer(String name) { 
				//"this" is a reference variable that refers to the current object
				// it can be used to refer to instance variables or methods of the current class
				// or passed as an argument in a method call
				this.name = name ;
        // set instance var name to given name
		}

		//methods

		/**
		 * Set the address of the customer to be given address
		 * @param address of the customer
		 **/
		public void setAddress(String address) {
				this.address = address;

		/**
		 * Return customers' name
		 * @return name of customers
		 **/
		public String getName() {
				return this.name;
		}

		/**
		 * Return customers' address
		 * @return address of customers
		 **/
		public String getAddress() {
				return this.address;
		}

	}

}
