package com.dxc.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.dxc.studio.model.Album;

@Repository
public class AlbumDALImp implements AlbumDAL{
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Album create(@RequestBody Album a) {
		// TODO Auto-generated method stub
		return mongo.save(a);
	}

	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Album.class);
	}

	@Override
	public Boolean delete(Album album) {
		// TODO Auto-generated method stub
		return mongo.remove(album).wasAcknowledged();
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Album.class);
	}

	@Override
	public Album update(String id, Album album) {
		// TODO Auto-generated method stub
		Query query= new Query(Criteria.where("id").is(id));
		Update update= new Update();
		return mongo.findAndModify(query, update, Album.class);
	}
}
