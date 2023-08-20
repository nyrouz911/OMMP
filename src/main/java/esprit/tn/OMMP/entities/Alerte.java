package esprit.tn.OMMP.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Alerte {
    @Id
    @GeneratedValue
    private Long id_alerte;
    //foreign key
    private Long id_affaire;
    private Date date_alerte;

    
}
