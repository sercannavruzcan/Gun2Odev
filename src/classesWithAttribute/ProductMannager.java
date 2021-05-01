package classesWithAttribute;

public class ProductMannager {
	public void Add(Product product) {
		//JDBC
		System.out.println("Ürün eklendi " + product.get_name());
		
	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price, String renk) {
		
	}

}
