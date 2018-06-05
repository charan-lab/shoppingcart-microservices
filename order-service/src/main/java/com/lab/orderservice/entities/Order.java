package com.lab.orderservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Class representing an order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Order Id, This helps in finding order uniquely")
	private Long id;

	@ApiModelProperty(notes = "Email id of customer")
	private String customerEmail;

	@ApiModelProperty(notes = "Full address of customer")
	private String customerAddress;

	@OneToMany(cascade = CascadeType.ALL)
	@ApiModelProperty(notes = "List of order items")
	private List<OrderItem> items;

}
