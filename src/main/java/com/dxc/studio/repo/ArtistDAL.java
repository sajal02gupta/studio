package com.dxc.studio.repo;

import java.util.List;

import com.dxc.studio.model.Artist;

public interface ArtistDAL {
	Artist create(Artist a);
	
	List<Artist> findAll();
	
	Boolean delete(Artist a);
	
	Artist findById(String id);
	
	Artist update(String id, Artist artist);
}
