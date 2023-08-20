package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Session {
    @Id
    @GeneratedValue
    private Long id_s;

    //foreign keys
    private Long dem; //id taa ldemandeur
    private Long def; //id taa ldefendeur
    private Long jug; //id taa juge
    private Long trib; //id taa tribunal
    private Long id_a; //id taa l'affaire
    
}
