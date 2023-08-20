package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SuiviChargeAffaire {
    
    @Id
    @GeneratedValue
    private Long id_s_c; //id charge affaire
    //foreign key
    private Long id_affaire; //id affaire
    private float montant; //montant
    //foreign key
    private Long huis; //id huissier
    private Long avo; //id avocat

    

}
