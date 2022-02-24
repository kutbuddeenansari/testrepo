package com.rest.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
public class Company {
	protected String name;
	protected String catchPhase;
	protected String bs;

}
