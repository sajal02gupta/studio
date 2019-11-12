package com.dxc.studio.repo;

import java.util.List;

import com.dxc.studio.model.Album;

public interface AlbumDAL {
	Album create(Album a);
	
	List<Album> findAll();
	
	public Boolean delete(Album album);

	Album findById(String id);
	
	Album update(String id, Album album);
}
