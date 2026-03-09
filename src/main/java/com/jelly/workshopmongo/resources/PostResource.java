package com.jelly.workshopmongo.resources;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 3890848868d304e55500bb8b3862a7ec75c25843
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jelly.workshopmongo.domain.Post;
import com.jelly.workshopmongo.resources.util.URL;
=======
import org.springframework.web.bind.annotation.RestController;

import com.jelly.workshopmongo.domain.Post;
>>>>>>> 3890848868d304e55500bb8b3862a7ec75c25843
import com.jelly.workshopmongo.service.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Post> findbyId(@PathVariable String id){
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
<<<<<<< HEAD
	
	@GetMapping(value="/titleserach")
	public ResponseEntity<List<Post>> findbyTitle(@RequestParam(value = "text", defaultValue = "") String text){
		text = URL.decodeParam(text);
		List<Post> list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);
	}
=======
>>>>>>> 3890848868d304e55500bb8b3862a7ec75c25843
}
