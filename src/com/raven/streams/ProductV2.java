package com.raven.streams;

import java.util.List;

public class ProductV2 {
    private String title;
    private String description;
    private double price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private String brand;
    private String category;
    private List<String> availableIn;

	public ProductV2(String title, String description, double price, double discountPercentage, double rating, int stock, String brand, String category, List<String> availableIn) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.rating = rating;
		this.stock = stock;
		this.brand = brand;
		this.category = category;
		this.availableIn = availableIn;
	}

	public String getTitle() {
		return title;
	}

	public ProductV2 setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public ProductV2 setDescription(String description) {
		this.description = description;
		return this;
	}

	public double getPrice() {
		return price;
	}

	public ProductV2 setPrice(double price) {
		this.price = price;
		return this;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public ProductV2 setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
		return this;
	}

	public double getRating() {
		return rating;
	}

	public ProductV2 setRating(double rating) {
		this.rating = rating;
		return this;
	}

	public int getStock() {
		return stock;
	}

	public ProductV2 setStock(int stock) {
		this.stock = stock;
		return this;
	}

	public String getBrand() {
		return brand;
	}

	public ProductV2 setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ProductV2 setCategory(String category) {
		this.category = category;
		return this;
	}

	public List<String> getAvailableIn() {
		return availableIn;
	}

	public ProductV2 setAvailableIn(List<String> availableIn) {
		this.availableIn = availableIn;
		return this;
	}

	@Override
	public String toString() {
		return "Product{" +
				"title='" + title + '\'' +
				", description='" + description + '\'' +
				", price=" + price +
				", discountPercentage=" + discountPercentage +
				", rating=" + rating +
				", stock=" + stock +
				", brand='" + brand + '\'' +
				", category='" + category + '\'' +
				", availableIn=" + availableIn +
				'}';
	}
}
