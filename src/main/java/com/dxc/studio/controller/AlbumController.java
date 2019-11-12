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

import com.dxc.studio.model.Album;
import com.dxc.studio.repo.AlbumDAL;

@RestController
public class AlbumController {
	@Autowired
	private AlbumDAL albumdal;
	
	@PostMapping("/albums")
	public void create(@RequestBody Album a){
		albumdal.create(a);
	}
	
	@GetMapping("/albums")
	public List<Album> findAll(){
		return albumdal.findAll();
	}
	@PutMapping("/tracks/{id}")
	public Album update(@PathVariable String id, @RequestBody Album trck){
		trck.setId(id);
		albumdal.create(trck);
		
		return trck;
	}
	
	@DeleteMapping("/albums/{id}")
	public Album delete(@PathVariable String id){
		Album deletedAlbum = albumdal.findById(id);
		if(albumdal.delete(deletedAlbum))
			return deletedAlbum;
		else
			return null;
		
	}
}
