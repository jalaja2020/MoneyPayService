package com.example.fiegnclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Accounts;

@FeignClient(name="http://BANKING-SERVICE/demo/orders")
public interface MoneyPayClient {
	@GetMapping("{phoneNumber}")
	public List<Accounts> fetchBankAccount(@PathVariable String phoneNumber);

}
