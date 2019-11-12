package com.dxc.studio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.studio.model.Artist;
import com.dxc.studio.repo.ArtistDAL;

@RestController
public class ArtistController {
	@Autowired
	private ArtistDAL artdal;
	
	@PostMapping("/artists")
	public void create(@RequestBody Artist a){
		artdal.create(a);
	}
	@GetMapping("/artists")
	public List<Artist> findAll(){
		return artdal.findAll();
	}
	@DeleteMapping("/artists/{id}")
	public Artist delete(@PathVariable String id){
		Artist deletedart = artdal.findById(id);
		if(artdal.delete(deletedart))
			return deletedart;
		else
			return null;
		
	}
	@PutMapping("/artists/{id}")
	public Artist update(@PathVariable String id, @RequestBody Artist artist){
		return artdal.update(id, artist);
	}
}
