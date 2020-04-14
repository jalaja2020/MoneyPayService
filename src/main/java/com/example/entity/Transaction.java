package com.example.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer transId;
	
	@Column(name="from_acc_no")
	private String fromAccNo;
	
	@Column(name="to_acc_no")
	private String toAccNo;
	
	@Column(name="trans_date")
	@Temporal(value=TemporalType.TIMESTAMP)
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date transDate;
	
	@Column(name="amount")
    private float amount;

    @ManyToOne
	@JoinColumn(name = "account_id")
	@JsonBackReference
	private Accounts accounts;
	
}
