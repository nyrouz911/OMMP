package esprit.tn.OMMP.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import esprit.tn.OMMP.entities.Affaire;

public interface AffaireRepository extends JpaRepository<Affaire,Long>{

    // Custom query to find Affaires by a specific attribute
    List<Affaire> findByNumber(int value);

    // Custom query using JPQL
    @Query("SELECT a FROM Affaire a WHERE a.NUMAFFAIRE = :attributeValue")
    List<Affaire> findCustomByNumber(@Param("attributeValue") int attributeValue);

    // Example of a custom count query
    @Query("SELECT COUNT(a) FROM Affaire a WHERE a.NUMAFFAIRE = :attributeValue")
    Long countAffairesByNumber(@Param("attributeValue") int attributeValue);
    
    // Add more custom methods here as needed
}
