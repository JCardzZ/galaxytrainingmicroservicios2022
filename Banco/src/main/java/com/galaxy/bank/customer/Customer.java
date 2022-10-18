package com.galaxy.bank.customer;

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
@Table(name="cliente")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombres")
	private String firstname;
	
	@Column(name="apellidos")
	private String lastname;
	
	private String dni;
	
	private String email;

	@Column(name="phonenumber")
	private String phoneNumber;
	
	private boolean state;
	
	@Column(name="createat")
	private LocalDate createAt;
	
	@Column(name="updateup")
	private LocalDate updateUp;

}
