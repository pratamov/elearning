package id.itguy.learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import id.itguy.learn.model.Content;

@RepositoryRestResource(collectionResourceRel = "content", path = "content")
public interface ContentRepository extends MongoRepository<Content, String>{

}
