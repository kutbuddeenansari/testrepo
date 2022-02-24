package com.rest.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Data
@Getter
@Setter
public class Company {
	protected String cname;
	protected String catchPhrase;
	protected String bs;

}
