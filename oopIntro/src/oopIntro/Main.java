package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		
		//böyle depolamýyoruz, obje depolayacaðýz
//		String[] products = {
//			"Lenovo V14",
//			"Lenovo V15",
//			"Hp 5"				
//		};
//		
//		int[] unitsInStock = {
//				
//		};
		

//constructor dan önce 
		
//		Product product1 = new Product(); //Örnek oluþturma, referans oluþturma, instance 		
//		product1.id = 1;
//		product1.name = "Lenovo V14";
//		product1.unitPrice = 15000;
//		product1.detail = "16 GB Ram";
//		
//		Product product2 = new Product(); 		
//		product2.id = 2;
//		product2.name = "Lenovo V15";
//		product2.unitPrice = 16000;
//		product2.detail = "32 GB Ram";
//		
//		Product product3 = new Product(); 
//		product3.id = 3;
//		product3.name = "Hp 5";
//		product3.unitPrice = 10000;
//		product3.detail = "8 GB Ram";
		
		Product product1 = new Product(1,"Lenovo V14", 15000,"16 GB Ram",20);
		
		Product product2 = new Product(); 		
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setUnitPrice(16000);
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3 = new Product(); 
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName ("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		

	}

}
