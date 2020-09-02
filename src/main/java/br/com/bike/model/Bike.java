package br.com.bike.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private boolean contact;
	private String email;
	private String model;
	private String name;
	private String phone;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyy")
	private LocalDateTime purchase_date;
	private BigDecimal purchase_price;
	private String serial_number;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isContact() {
		return contact;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public LocalDateTime getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(LocalDateTime purchase_date) {
		this.purchase_date = purchase_date;
	}
	public BigDecimal getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(BigDecimal purchase_price) {
		this.purchase_price = purchase_price;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	
	
}
