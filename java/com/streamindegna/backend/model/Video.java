package com.streamindegna.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Video {
	
	@Id
	public Integer id;
	public Integer token;
	public String title;
	public String description;
	
	public Video() {}
	
	public Video(Integer id, Integer token, String title, String description) {
		super();
		this.id = id;
		this.token = token;
		this.title = title;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public Integer getToken() {
		return token;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setToken(Integer token) {
		this.token = token;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
