package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Product extends Model{

	@Id
	private Long id;

	//@Constraints.Required
	private String name;

	//@Constraints.Required
	private String description;

	//@Constraints.Required
	private int stock;

	//@Constraints.Required
	private double price;

	public Product(){
	}

	public Product(Long idIn, String nameIn, String descriptionIn, int stockin, double priceIn){
	id = idIn;
	name = nameIn;
	description = descriptionIn;
	stock = stockIn;
	price = priceIn;

	public Long getId(){
		return id;
	}

	public void setId(Long idIn){
		id = idIn;
	}

	public String getName(){
		return name;
	}

	public void setName(String nameIn){
		name = nameIn;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String descriptionIn){
		description = descriptionIn;
	}

	public int getStock(){
		return stock;
	}

	public void setStock(int stockIn){
		stock = stockIn;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double priceIn){
		price = priceIn;
	}


