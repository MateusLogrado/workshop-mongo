package com.jelly.workshopmongo.service;

<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 3890848868d304e55500bb8b3862a7ec75c25843
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

<<<<<<< HEAD
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
=======
	
>>>>>>> 3890848868d304e55500bb8b3862a7ec75c25843
	
}
