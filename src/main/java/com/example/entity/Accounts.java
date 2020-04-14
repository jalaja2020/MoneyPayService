package com.example.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts {
	
	private Integer accountId;
	
	private String accNumber;

	private String bankName;

	private float amount;
	
	private String phoneNo;

	private Date transDate;
	
	

}
