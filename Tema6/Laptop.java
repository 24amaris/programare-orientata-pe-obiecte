package ro.emanuel;

public class Laptop {
	private String brand;
	private double pret;
	private int ram;

	public Laptop(String brand, double pret, int ram) {
		this.brand = brand;
		this.pret = pret;
		this.ram = ram;
	}

	// Getters
	public String getBrand() {
		return brand;
	}

	public double getPret() {
		return pret;
	}

	public int getRam() {
		return ram;
	}
}
