package com.waiyanhtet.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.ElementCollection;

@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String name;
	private String category;

	@ElementCollection
	private Map<PriceType, Integer> price;
	
	@ElementCollection
	private List<String> tags;

	public enum PriceType {
		Customer, Agent, Purchase;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Map<PriceType, Integer> getPrice() {
		return price;
	}

	public void setPrice(Map<PriceType, Integer> price) {
		this.price = price;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
