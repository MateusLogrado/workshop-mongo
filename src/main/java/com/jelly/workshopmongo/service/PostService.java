package com.jelly.workshopmongo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jelly.workshopmongo.domain.Post;
import com.jelly.workshopmongo.repository.PostRepository;
import com.jelly.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}


	public List<Post> findByTitle(String text){
		return repo.findByTitle(text);
	}
	
	@SuppressWarnings("deprecation")
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getDate() + 24 * 60 *60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
	
}
