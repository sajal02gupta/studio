package com.dxc.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.dxc.studio.model.Artist;
@Repository
public class ArtistDALImp implements ArtistDAL{
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Artist create(@RequestBody Artist a) {
		// TODO Auto-generated method stub
		return mongo.save(a);
	}

	@Override
	public List<Artist> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Artist.class);
	}

	@Override
	public Boolean delete(Artist a) {
		// TODO Auto-generated method stub
		return mongo.remove(a).wasAcknowledged();
	}

	@Override
	public Artist findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Artist.class);
	}

	@Override
	public Artist update(String id, Artist artist) {
			// TODO Auto-generated method stub
			Query query= new Query();
			query.addCriteria(Criteria.where("id").is(id));
			return mongo.save(artist);
	}
	
}
