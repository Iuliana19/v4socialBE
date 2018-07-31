package com.v4social.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Question implements Serializable {
	@Id
	@GeneratedValue
	private Integer code;

	@Column
	private String name;

	@Column(length = 2000)
	private String description;

	public Question(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}