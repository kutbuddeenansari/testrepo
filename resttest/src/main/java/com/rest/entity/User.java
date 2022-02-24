package com.rest.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	protected Long id;
	
	
	protected String name;
	@Column(name="user_nm",unique = true, nullable = false)
	protected String username;
	
	@Column(unique = true, nullable = false)
	protected String email;
	@Embedded
	protected Address address;
	
	@Column(unique = true, nullable = false)
	protected String phone;
	protected String website;
	@Embedded
	protected Company company;
	
	
}
