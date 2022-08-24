package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.UserModel;

public interface UserRepository extends MongoRepository<UserModel, UserModel>  {		
	
}
