package ro.emanuel.phone.pojo;

public class Phone {
	private int id;
	private String brand;
	private int price;
	private int ram;

public Phone() {
}

public Phone(int id, String brand, int price, int ram) {
	super();
	this.id = id;
	this.brand = brand;
	this.price = price;
	this.ram = ram;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

}
