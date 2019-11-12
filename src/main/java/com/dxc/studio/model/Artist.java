package com.dxc.studio.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artist {
	@Id
	private String id;
	private String name;
	private String gender;
	@DBRef
	private Track track;
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artist(String id, String name, String gender, Track track) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.track = track;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Track getTrack() {
		return track;
	}
	public void setTrack(Track track) {
		this.track = track;
	}
	
	
}