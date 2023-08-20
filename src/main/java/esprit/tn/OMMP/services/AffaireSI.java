package esprit.tn.OMMP.services;

import esprit.tn.OMMP.entities.Affaire;

import java.util.List;

public interface AffaireSI {

    List<Affaire> getAllAffaires();

    Affaire getAffaireById(Long id);

    Affaire createAffaire(Affaire affaire);

    Affaire updateAffaire(Long id, Affaire affaire);

    void deleteAffaire(Long id);
}
