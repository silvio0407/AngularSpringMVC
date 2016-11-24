package uaiContacts.repository;

import org.springframework.data.repository.CrudRepository;

import uaiContacts.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByEmail(String email);
	
	/*@Query(value = "select u from User u join u.person p join p.dogs d")
	User myComplicatedQuery();*/
}
