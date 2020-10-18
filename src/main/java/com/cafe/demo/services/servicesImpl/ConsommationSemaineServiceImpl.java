package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.ConsommationSemaine;
import com.cafe.demo.repositories.ConsommationSemaineRepository;
import com.cafe.demo.services.services.ConsommationSemaineService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsommationSemaineServiceImpl implements ConsommationSemaineService {
private final ConsommationSemaineRepository consommationSemaineRepository;

    public ConsommationSemaineServiceImpl(ConsommationSemaineRepository consommationSemaineRepository) {
        this.consommationSemaineRepository = consommationSemaineRepository;
    }

    @Override
    public Object save(ConsommationSemaine entity) {
        return consommationSemaineRepository.save(entity);
    }

    @Override
    public void update(ConsommationSemaine entity) {
        consommationSemaineRepository.save(entity);
    }

    @Override
    public void delete(ConsommationSemaine entity) {
        consommationSemaineRepository.delete(entity);
    }

    @Override
    public List<ConsommationSemaine> findAll() {
        return consommationSemaineRepository.findAll();
    }
}
