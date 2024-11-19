package ro.emanuel.order.pojo;

public class OrderPOJO {
	
	private int id;
	private String name;
	private int price;
	private int cod;

public OrderPOJO() {
}

public OrderPOJO(int id, String name, int price, int cod) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.cod = cod;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getCod() {
	return cod;
}

public void setCod(int cod) {
	this.cod = cod;
}

}

