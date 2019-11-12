package com.dxc.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Track {
	@Id
	private String id;
	private String trackName;
	private String genre;
	private String album;
	private List<String> artists;
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Track(String id, String trackName, String genre, String album, List<String> artists) {
		super();
		this.id = id;
		this.trackName = trackName;
		this.genre = genre;
		this.album = album;
		this.artists = artists;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public List<String> getArtists() {
		return artists;
	}
	public void setArtists(List<String> artists) {
		this.artists = artists;
	}
	
}