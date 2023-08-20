package esprit.tn.OMMP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import esprit.tn.OMMP.entities.Session;

public interface SessionRepository extends JpaRepository<Session,Long> {
    
}
