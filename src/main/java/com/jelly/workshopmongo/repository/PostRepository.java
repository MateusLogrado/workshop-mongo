package com.jelly.workshopmongo.repository;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 3890848868d304e55500bb8b3862a7ec75c25843
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jelly.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

<<<<<<< HEAD
	List<Post> findByTitleContainingIgnoreCase(String text);
=======
	
>>>>>>> 3890848868d304e55500bb8b3862a7ec75c25843
	
}
