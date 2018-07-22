
public class sale {
	
	private String name; 
	private double price; 
	
	public sale(){
		name = "No name...";
		price = 0.0; 
	}
	
	public sale(String theName, double thePrice) {
		setName(theName);
		setPrice(thePrice);
	}
	public sale(sale originalObject) {
		if (originalObject == null) {
			System.out.println("err");
			System.exit(0);
		}else {
			name = originalObject.name;
			price = originalObject.price;
		}
	}
	public static void announcement(){
		System.out.println("err");
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double newPrice ) {
		if(newPrice >= 0) {
			price = newPrice;
		}else {
				System.out.println("err");
				System.exit(0);
			}
		}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		if(newName != null && newName != "") {
			name = newName;
		}else {
			System.out.println("err");
			System.exit(0);
		}
	}
	public String toString(){
		return (name + " Price and total cost = $" + price);
	}
	public double bill() {
		return price;
	}
	public boolean equalDeal(sale otherSale) {
		if (otherSale == null) {
			return false;
		}else {
			return (name.equals(otherSale.name)
					&& bill() == otherSale.bill() );
		}
	}
	public boolean lessThan(sale otherSale) {
		if(otherSale == null) {
			System.out.println("err");
			System.exit(0);
		}
		return(bill() < otherSale.bill());
	}
	public boolean equals(Object otherObject) {
		if (otherObject == null) {
			return false;
		}else if (getClass() != otherObject.getClass()) {
			return false;
		}else {
			sale otherSale = (sale)otherObject;
			return(name.equals(otherSale.name)
				&&(price == otherSale.price));		
		}
	}
}
