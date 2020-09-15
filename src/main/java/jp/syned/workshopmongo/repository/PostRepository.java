package jp.syned.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import jp.syned.workshopmongo.domain.Post;
import jp.syned.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}