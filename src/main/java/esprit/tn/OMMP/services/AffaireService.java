package esprit.tn.OMMP.services;

import esprit.tn.OMMP.entities.Affaire;
import esprit.tn.OMMP.repositories.AffaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AffaireService implements AffaireSI {

    private final AffaireRepository affaireRepository;

    @Autowired
    public AffaireService(AffaireRepository affaireRepository) {
        this.affaireRepository = affaireRepository;
    }

    @Override
    public List<Affaire> getAllAffaires() {
        return affaireRepository.findAll();
    }

    @Override
    public Affaire getAffaireById(Long id) {
        Optional<Affaire> optionalAffaire = affaireRepository.findById(id);
        return optionalAffaire.orElse(null);
    }

    @Override
    public Affaire createAffaire(Affaire affaire) {
        return affaireRepository.save(affaire);
    }

    @Override
    public Affaire updateAffaire(Long id, Affaire affaire) {
        if (affaireRepository.existsById(id)) {
            affaire.setIdAffaire(id);
            return affaireRepository.save(affaire);
        }
        return null;
    }

    @Override
    public void deleteAffaire(Long id) {
        affaireRepository.deleteById(id);
    }
}
