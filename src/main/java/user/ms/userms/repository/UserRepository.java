package user.ms.userms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import user.ms.userms.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
    @Query (value = "{'usid':?0}")   
    User findByUsid(String usid);
}