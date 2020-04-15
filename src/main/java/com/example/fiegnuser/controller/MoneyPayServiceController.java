package com.example.fiegnuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Accounts;
import com.example.entity.FundTransferDto;
import com.example.fiegnclient.MoneyPayClient;

@RestController
@RequestMapping("/MoneyPay")
public class MoneyPayServiceController {
	@Autowired
	MoneyPayClient moneyPayClient;
	
	@GetMapping("/test")
	public String test() {
		return "hi";
	}
	
	@GetMapping("{phoneNumber}")
	public List<Accounts> RegisterPhoneNumber(@PathVariable String phoneNumber) {
		return moneyPayClient.fetchBankAccount(phoneNumber);
	}
	
	@PostMapping("/fundTransfer")
	public String fundTransfer(@RequestBody FundTransferDto fundTransferDto) {
		return moneyPayClient.fundTransfer(fundTransferDto);
	}
}
