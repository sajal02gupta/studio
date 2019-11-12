package com.dxc.studio.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {
	@Id
	private String id;
	private String albumName;
	private String yearOfRelease;
	@DBRef
	private List<Artist> artists;
	@DBRef
	private List<Track> track;
	
	@CreatedDate
	private Date createdDate= new Date();
	
	@org.springframework.data.annotation.LastModifiedDate
	private Date LastModifiedDate= new Date();
	
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(String id, String albumName, String yearOfRelease, List<Artist> artist, List<Track> track) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.yearOfRelease = yearOfRelease;
		this.artists = artist;
		this.track = track;
	}

	
	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return LastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
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
		return artists;
	}

	public void setArtist(List<Artist> artist) {
		this.artists = artist;
	}

	public List<Track> getTrack() {
		return track;
	}

	public void setTrack(List<Track> track) {
		this.track = track;
	}
	
}