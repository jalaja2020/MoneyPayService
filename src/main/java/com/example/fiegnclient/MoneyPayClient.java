package com.example.fiegnclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Accounts;
import com.example.entity.FundTransferDto;

@FeignClient(name="http://BANKING-SERVICE/demo/bank")
public interface MoneyPayClient {
	
	@GetMapping("{phoneNumber}")
	public List<Accounts> fetchBankAccount(@PathVariable String phoneNumber);
	
	@PostMapping("/fundTransfer")
	public String fundTransfer(@RequestBody FundTransferDto fundTransferDto);
}
