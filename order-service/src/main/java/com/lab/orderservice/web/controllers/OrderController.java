package com.lab.orderservice.web.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.orderservice.entities.Order;
import com.lab.orderservice.repositories.OrderRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api("Set of endpoints for creating and retrieving order details")
public class OrderController {

	private OrderRepository repo;

	@Autowired
	public OrderController(OrderRepository repo) {
		this.repo = repo;
	}

	@RequestMapping("/api/orders")
	@ApiOperation("Create an order")
	public Order createOrder(@RequestBody Order order) {
		return repo.save(order);
	}

	@RequestMapping("/api/orders/{id}")
	@ApiOperation("Find an order by Id")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "User's name", required = false, dataType = "string", paramType = "query", defaultValue = "1") })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	public Optional<Order> findOrderById(@ApiParam("Provide the orderId") @PathVariable Long id) {
		return repo.findById(id);
	}

}
