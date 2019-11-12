package com.dxc.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.dxc.studio.model.Album;
import com.dxc.studio.model.Track;

@Repository
public class TrackDALImp implements TrackDAL{
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Track create(@RequestBody Track t) {
		// TODO Auto-generated method stub
		return mongo.save(t);
	}

	@Override
	public List<Track> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Track.class);
	}

	@Override
	public Boolean delete(Track t) {
		// TODO Auto-generated method stub
		return mongo.remove(t).wasAcknowledged();
	}

	@Override
	public Track findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Track.class);
	}
	
}
