package esprit.tn.OMMP.repositories;

import esprit.tn.OMMP.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {
    
    // Example of a custom query using JPQL
    @Query("SELECT s FROM Session s WHERE s.dem = ?1")
    List<Session> findSessionsByDem(Long demId);
    
    
    
}
