package com.dxc.studio.repo;

import java.util.List;

import com.dxc.studio.model.Track;

public interface TrackDAL {
	Track create(Track t);
	
	List<Track> findAll();
	
	Boolean delete(Track t);
	
	Track findById(String id);
	
	Track update(String id, Track track);
}
