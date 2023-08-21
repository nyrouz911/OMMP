package esprit.tn.OMMP.services;

import esprit.tn.OMMP.entities.Session;
import esprit.tn.OMMP.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService implements SessionServiceInterface {
    private final SessionRepository sessionRepository;

    @Autowired
    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public void addSession(Session session) {
        sessionRepository.save(session);
    }

    @Override
    public Optional<Session> getSessionById(Long sessionId) {
        return sessionRepository.findById(sessionId);
    }

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public List<Session> getSessionsByDem(Long demId) {
        return sessionRepository.findSessionsByDem(demId);
    }

    // You can implement more methods from the SessionServiceInterface here
}
