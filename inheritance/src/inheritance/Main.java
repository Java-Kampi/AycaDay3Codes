package inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		//NOOOOOOO
//		Customer customer = new Customer();
//		customer.id = 1;
//		customer.firstName = "Engin";
//		customer.lastName = "Demiroð";
//		customer.nationalIdentity = "12345678901";
//		customer.customerNumber = "1234";
		
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(engin);
//		customerManager.add(abc);
		
		Customer[] customers = {engin, hepsiBurada, abc};
		customerManager.addMultiple(customers);

	}

}
