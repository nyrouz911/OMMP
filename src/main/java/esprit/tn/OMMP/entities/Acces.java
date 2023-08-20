package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Acces {
    @Id
    @GeneratedValue
    private Long id_acces;
    private Long id_user;
    private Long id_page;
    private Long consulter;
    private Long ajouter;
    private Long supprimer;
    private Long modifier;    
}
