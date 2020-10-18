package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.Demande;
import com.cafe.demo.entities.Developpeur;
import com.cafe.demo.repositories.DemandeRepository;
import com.cafe.demo.services.services.DemandeService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class DemandeServiceImpl  implements DemandeService {
    private final DemandeRepository demandeRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public DemandeServiceImpl(DemandeRepository demandeRepository) {
        this.demandeRepository = demandeRepository;
    }

    @Override
    public Object save(Demande entity) {
        return demandeRepository.save(entity);
    }

    @Override
    public void update(Demande entity) {
        demandeRepository.save(entity);
    }

    @Override
    public void delete(Demande entity) {
        demandeRepository.delete(entity);
    }

    @Override
    public List<Demande> findAll() {
        return demandeRepository.findAll();
    }


    //@Query(value = "SELECT u FROM Developpeur u WHERE u.name IN :names")
    public List<Demande> programmeursWithNbrMax() {
        TypedQuery<Demande> query =
                entityManager.createQuery("SELECT d FROM Demande d left join Developpeur", Demande.class);
        ArrayList<Demande> results;
        results= (ArrayList<Demande>) query.getResultList();
        return  results;
    }
}
