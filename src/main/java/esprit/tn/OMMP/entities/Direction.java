package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Direction {
    
    @Id
    @GeneratedValue
    private Long idDir;
    //foreign key taa personne
    private Long idP;
    private String libDir; //esm el direction
    

}
