package esprit.tn.OMMP.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Affaire {
    @Id
    @GeneratedValue
    private Long idAffaire;
    private Long idS; // foreign key mtaa session
    private Long dem; // id taa demandeur
    private Long def; // id taa defendeur
    private Date dateDeLaMesure; // date mtaa naarch chneya
    private Long trib; // id taa tribunal
    private Long avo; // id taa l avocat
    private String sujet; // subject taa l'affaire
    private float montantOuValeur;
    private Long direction; // direction mtaa naarch chnowa
    private String jugementdel_affaire;
    private Long huis; // id mtaa l'huissier
    private Long etatAffaire; // etat mtaa l'affaire clawzed wala la
    private Long NUMAFFAIRE; // numero mtaa l'affaire
}
