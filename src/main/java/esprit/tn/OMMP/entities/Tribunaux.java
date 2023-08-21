package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tribunaux {

    @Id
    @GeneratedValue
    private Long idTR;

    private String nom;

    private String region;
}
