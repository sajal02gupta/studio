package com.dxc.studio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.studio.model.Track;
import com.dxc.studio.repo.TrackDAL;

@RestController
public class TrackController {
	@Autowired
	private TrackDAL trackdal;
	
	@PostMapping("/tracks")
	public void create(@RequestBody Track t){
		trackdal.create(t);
	}
	
	@GetMapping("/tracks")
	public List<Track> findAll(){
		return trackdal.findAll();
	}
	
	@PutMapping("/tracks/{id}")
	public Track update(@PathVariable String id, @RequestBody Track track){
		return trackdal.update(id, track);
	}
	
	@DeleteMapping("/tracks/{id}")
	public Track delete(@PathVariable String id){
		Track deletedAlbum = trackdal.findById(id);
		if(trackdal.delete(deletedAlbum))
			return deletedAlbum;
		else
			return null;
		
	}
}
