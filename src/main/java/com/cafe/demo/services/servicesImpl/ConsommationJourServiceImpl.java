package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.Consommation;
import com.cafe.demo.entities.ConsommationJour;
import com.cafe.demo.repositories.ConsommationJourRepository;
import com.cafe.demo.services.services.ConsommationJourService;
import com.cafe.demo.services.services.ConsommationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsommationJourServiceImpl implements ConsommationJourService {
    private final ConsommationJourRepository consommationJourRepository;

    public ConsommationJourServiceImpl(ConsommationJourRepository consommationJourRepository) {
        this.consommationJourRepository = consommationJourRepository;
    }


    @Override
    public Object save(ConsommationJour entity) {
        return consommationJourRepository.save(entity);
    }

    @Override
    public void update(ConsommationJour entity) {
        consommationJourRepository.save(entity);
    }

    @Override
    public void delete(ConsommationJour entity) {
        consommationJourRepository.delete(entity);
    }

    @Override
    public List<ConsommationJour> findAll() {
        return consommationJourRepository.findAll();
    }
}
