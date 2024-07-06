package api.springTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import api.springTest.model.*;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
 