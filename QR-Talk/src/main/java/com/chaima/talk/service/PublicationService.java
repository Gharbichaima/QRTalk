package com.chaima.talk.service;

import java.util.List;

import com.chaima.talk.entities.Publication;
import com.chaima.talk.entities.User;

public interface PublicationService {

	User saveUser(User u);
	User getUser(String id);
	Publication savePub(Publication p);
	Publication updatePub(Publication p);
	void deletePub(Publication p);
	void deletePubById(Long id);
	Publication getPublication(Long id);
	List<Publication> getAllPublications();
	//List<Publication> trierPubDate();

}
