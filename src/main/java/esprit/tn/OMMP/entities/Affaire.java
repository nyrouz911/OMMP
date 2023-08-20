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
    private int idS; //foreign key mtaa session
    private int dem; //id taa demandeur
    private int def; //id taa defendeur
    private Date dateDeLaMesure; //date mtaa naarch chneya
    private int trib; //id taa tribunal
    private int avo; //id taa l avocat
    private String sujet; //subject taa l'affaire
    private float montantOuValeur; 
    private int direction; //direction mtaa naarch chnowa
    private String jugementdel_affaire;
    private int huis; //id mtaa l'huissier
    private int etatAffaire; //etat mtaa l'affaire clawzed wala la
    private int NUMAFFAIRE; //numero mtaa l'affaire
}
