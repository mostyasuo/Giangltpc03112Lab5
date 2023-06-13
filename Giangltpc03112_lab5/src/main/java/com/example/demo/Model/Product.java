package com.example.demo.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;
String name;
String image;
Double price;
@Temporal(TemporalType.DATE)
@Column(name = "Createdate")
Date createDate = new Date();
Boolean available;
@ManyToOne @JoinColumn(name = "Categoryid")
Category category;
@OneToMany(mappedBy = "product")
List<OrderDetail> orderDetails;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
public Boolean getAvailable() {
	return available;
}
public void setAvailable(Boolean available) {
	this.available = available;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public List<OrderDetail> getOrderDetails() {
	return orderDetails;
}
public void setOrderDetails(List<OrderDetail> orderDetails) {
	this.orderDetails = orderDetails;
}
}
