package esprit.tn.OMMP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Logs {
    @Id
    @GeneratedValue
    private Long id_log; //id taa l log
    private String action; //chneya el 3amla
    private Long id_user; //id mtaa l user moula el 3amla
    private String old_value;
    private String new_value;
}
