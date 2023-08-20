package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Page {
    @Id
    @GeneratedValue
    private Long id_page;
    //foreign key
    private Long id_acces;
    
    private Long libPage;    
}
