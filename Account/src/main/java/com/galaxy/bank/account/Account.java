package com.galaxy.bank.account;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cuentas")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="numaccount")
	private String numAccount;
	
	private String type;
	
	@Column(name="customerid")
	private Long customerId;
	
	@Column(name="limittransaction")
	private Long limitTransaction;
	
	@Column(name="commissionamount")
	private double commissionAmount;
	
	@Column(name="availablebalance")
	private double availableBalance;

	@Column(name="createat")
	private LocalDate createAt;
	
	@Column(name="updateup")
	private LocalDate updateUp;

}
