package com.dxc.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {
	@Id
	private String id;
	private String albumName;
	private String yearOfRelease;
	@DBRef
	private List<Artist> artist;
	@DBRef
	private List<Track> track;
	
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(String id, String albumName, String yearOfRelease, List<Artist> artist, List<Track> track) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.yearOfRelease = yearOfRelease;
		this.artist = artist;
		this.track = track;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public List<Artist> getArtist() {
		return artist;
	}

	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}

	public List<Track> getTrack() {
		return track;
	}

	public void setTrack(List<Track> track) {
		this.track = track;
	}
	
}