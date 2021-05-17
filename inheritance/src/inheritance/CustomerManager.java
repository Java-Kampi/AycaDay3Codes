package inheritance;

public class CustomerManager {
	
	//NOOOOOO
//	public void add(IndividualCustomer individualCustomer) {
//		System.out.println(individualCustomer.customerNumber +" eklendi");
//	}
//
//	public void add(CorporateCustomer corporateCustomer) {
//		System.out.println(corporateCustomer.customerNumber +" eklendi");
//	}
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber +" eklendi");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}


//SOLID - Open Closed Principle 