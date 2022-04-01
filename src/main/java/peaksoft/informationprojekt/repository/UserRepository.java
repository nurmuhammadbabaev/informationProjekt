package peaksoft.informationprojekt.repository;

import org.springframework.data.repository.CrudRepository;
import peaksoft.informationprojekt.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {


}
