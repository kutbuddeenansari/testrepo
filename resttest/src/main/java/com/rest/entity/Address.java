package com.rest.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Getter
@Setter
public class Address {
	protected String street;
	protected String suite;
	protected String city;
	protected String zipcode;
	@Embedded
	protected Geo geo;
	
	
}

