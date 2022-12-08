package com.waiyanhtet.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String name;
	private String category;

	@ElementCollection
	@CollectionTable(name = "PRODUCT_PRICE", joinColumns = @JoinColumn(name = "product", referencedColumnName = "id"))
	@MapKeyColumn(name = "type")
	@MapKeyEnumerated(EnumType.STRING)
	private Map<PriceType, Integer> price;

	@ElementCollection
	@CollectionTable(name = "PRODUCT_TAGS", joinColumns = @JoinColumn(name = "product", referencedColumnName = "id"))
	private List<String> tags;

	@ElementCollection
	@CollectionTable(joinColumns = @JoinColumn(name = "product", referencedColumnName = "id"), name = "PRODUCT_FEATURE")
	private Set<Feature> feature;

	public enum PriceType {
		Customer, Agent, Purchase;
	}

	public Set<Feature> getFeature() {
		return feature;
	}

	public void setFeature(Set<Feature> feature) {
		this.feature = feature;
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
