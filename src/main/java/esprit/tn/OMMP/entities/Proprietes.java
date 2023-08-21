package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Proprietes {
    
    @Id
    @GeneratedValue
    private Long idProp;
    //foreign key
    private Long idP;
    private String lib;
}
