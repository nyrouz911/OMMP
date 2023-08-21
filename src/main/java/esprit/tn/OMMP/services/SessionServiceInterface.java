package esprit.tn.OMMP.services;

import esprit.tn.OMMP.entities.Session;

import java.util.List;
import java.util.Optional;

public interface SessionServiceInterface {
    void addSession(Session session);
    
    Optional<Session> getSessionById(Long sessionId);
    
    List<Session> getAllSessions();
    
    List<Session> getSessionsByDem(Long demId);
    
    // You can add more method signatures here
}
