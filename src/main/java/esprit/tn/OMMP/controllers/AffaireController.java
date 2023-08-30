package esprit.tn.OMMP.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esprit.tn.OMMP.entities.Affaire;
import esprit.tn.OMMP.services.AffaireService;

@RestController
@RequestMapping("affaire")
public class AffaireController {
    @Autowired
    //AffaireRepository affaireRepository;
    AffaireService affaireservice;

    @PostMapping
    Affaire save (@RequestBody Affaire affaire){
        return affaireservice.createAffaire(affaire);
    }

    @GetMapping
    List<Affaire> getAll(){
        return affaireservice.getAllAffaires();
    }
    
    //ATTENTION HOUNI BCH TAAYET LEL SERVICE LI HOWA BIDOU BCH YAAYET LEL REPOSITORY 
    //MOUCH TAAYET LEL REPOSITORY TOUL

    
    void delete (@RequestBody Affaire affaire){
        affaireservice.deleteAffaire(affaire);
    }
}
