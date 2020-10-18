package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.Developpeur;
import com.cafe.demo.repositories.DeveloppeurRepository;
import com.cafe.demo.services.services.DeveloppeurService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeveloppeurServiceImp implements DeveloppeurService {
    private final DeveloppeurRepository developpeurRepository ;

    public DeveloppeurServiceImp(DeveloppeurRepository developpeurRepository) {
        this.developpeurRepository = developpeurRepository;

    }

    @Override
    public Object save(Developpeur entity) { return this.developpeurRepository.save(entity); }

    @Override
    public void update(Developpeur entity) {
        developpeurRepository.save(entity);
    }

    @Override
    public void delete(Developpeur entity)  {
        developpeurRepository.delete(entity) ;
    }

    @Override
    public List<Developpeur> findAll() {
        return developpeurRepository.findAll();
    }
}
