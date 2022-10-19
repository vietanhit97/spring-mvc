package com.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

public class Book {
	@NotEmpty(message = "khong duoc trong ")
	private String id ;
	@NotEmpty(message = "khong duoc trong ")
	private String name;
	@NotEmpty(message = "khong duoc trong ")
	private String author;
	@NotEmpty(message = "khong duoc trong ")
	private String nhaxb;
	private int namxb;
	private int index;
	private float price;
	private MultipartFile file;
	
	public Book() {
		super();
	}

	public Book(@NotEmpty(message = "khong duoc trong ") String id,
			@NotEmpty(message = "khong duoc trong ") String name,
			@NotEmpty(message = "khong duoc trong ") String author,
			@NotEmpty(message = "khong duoc trong ") String nhaxb, int namxb, int index, float price,
			MultipartFile file) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.nhaxb = nhaxb;
		this.namxb = namxb;
		this.index = index;
		this.price = price;
		this.file = file;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getNhaxb() {
		return nhaxb;
	}

	public void setNhaxb(String nhaxb) {
		this.nhaxb = nhaxb;
	}

	public int getNamxb() {
		return namxb;
	}

	public void setNamxb(int namxb) {
		this.namxb = namxb;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
