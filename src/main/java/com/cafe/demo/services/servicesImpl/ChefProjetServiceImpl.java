package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.ChefProjet;
import com.cafe.demo.repositories.ChefProjetRepository;
import com.cafe.demo.services.services.ChefProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChefProjetServiceImpl implements ChefProjetService {
    @Autowired
    private ChefProjetRepository chefProjetRepository;
    @Override
    public Object save(ChefProjet entity) {
        return chefProjetRepository.save(entity);
    }

    @Override
    public void update(ChefProjet entity) {
         chefProjetRepository.save(entity);
    }

    @Override
    public void delete(ChefProjet entity) {
         chefProjetRepository.delete(entity);
    }

    @Override
    public List<ChefProjet> findAll() {
        return chefProjetRepository.findAll();
    }
}
