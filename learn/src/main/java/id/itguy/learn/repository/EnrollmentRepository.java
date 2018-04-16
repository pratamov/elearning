package id.itguy.learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import id.itguy.learn.model.Enrollment;

@RepositoryRestResource(collectionResourceRel = "enrollment", path = "enrollment")
public interface EnrollmentRepository extends MongoRepository<Enrollment, String>{

}
