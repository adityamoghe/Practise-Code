package com.yash.builder;

public class Shirt {

	private Size size = new Size();
	private Price price = new Price();
	private Brand brand = new Brand();

	@Override
	public String toString() {
		return "Shirt [size=" + size + ", price=" + price + ", brand=" + brand + ", getSize()=" + getSize()
				+ ", getPrice()=" + getPrice() + ", getBrand()=" + getBrand() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
