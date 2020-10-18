package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.Consommation;
import com.cafe.demo.repositories.ConsommationJourRepository;
import com.cafe.demo.repositories.ConsommationRepository;
import com.cafe.demo.services.services.ConsommationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsommationServiceImpl implements ConsommationService {
    private final ConsommationRepository consommationRepository;
    private final ConsommationJourRepository consommationJourRepository ;
    public ConsommationServiceImpl(ConsommationRepository consommationRepository, ConsommationJourRepository consommationJourRepository) {
        this.consommationRepository = consommationRepository;
        this.consommationJourRepository = consommationJourRepository;
    }

    @Override
    public Object save(Consommation entity) {
        return consommationRepository.save(entity);
    }

    @Override
    public void update(Consommation entity) {
        consommationRepository.save(entity);
    }

    @Override
    public void delete(Consommation entity) {
        consommationRepository.delete(entity);
    }

    @Override
    public List<Consommation> findAll() {
        return consommationRepository.findAll();
    }
}
