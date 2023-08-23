// package esprit.tn.OMMP.repositories;

// import esprit.tn.OMMP.entities.Session;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

// import java.util.List;

// public interface SessionRepository extends JpaRepository<Session, Long> {
    
//     // Example of a custom query using JPQL
//     @Query("SELECT s FROM Session s WHERE s.dem = ?1")
//     List<Session> findSessionsByDem(Long demId);
    
//     @Query("SELECT s FROM Session s WHERE s.def = ?1")
//     List<Session> findSessionsByDef(Long defId);
    
//     @Query("SELECT s FROM Session s WHERE s.juge = ?1")
//     List<Session> findSessionsByJuge(Long jugId);

//     @Query("SELECT s FROM Session s WHERE s.trib = ?1")
//     List<Session> findSessionsByTrib(Long tribId);

//     @Query("SELECT s FROM Session s WHERE s.affaire = ?1")
//     List<Session> findSessionsByAffaire(Long affaireId);
// }
