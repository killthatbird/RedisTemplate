package org.wlfek.test.Domain;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;


public class User implements Serializable {
	
	private static final long serialVersionUID = -5151045162928912913L;

	@NotNull
	String name;
	
	@Min(1)
	@Max(1000000000)
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
