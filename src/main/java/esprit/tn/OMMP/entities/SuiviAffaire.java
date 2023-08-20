package esprit.tn.OMMP.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SuiviAffaire {
    @Id
    @GeneratedValue
    private Long idSuiviA;
    private Date dateDebutConf; //date debut mtaa naarch chnowa
    private Date dateFinConf; //date fin mtaa naarch chnowa

    //foreign key
    private Long avo; //id taa l avocat
    private Long trib; //id taa l tribunal
    private Long huis; //id taa l'huissier
    private Long def; //id taa l defendeur
    private Long dem; //id taa l demandeur
    private Long idAffaire; //id taa l affaire
    private Long dir; //id taa l direction
    
    private String situation; //win weslet el kadheya 
}
