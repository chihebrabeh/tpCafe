package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.Equipe;
import com.cafe.demo.repositories.EquipeRepository;
import com.cafe.demo.services.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipeServiceImpl  implements EquipeService {
    @Autowired
    private EquipeRepository equipeRepository ;

    @Override
    public Object save(Equipe entity) {
        return equipeRepository.save(entity);
    }

    @Override
    public void update(Equipe entity) {
        equipeRepository.save(entity);
    }

    @Override
    public void delete(Equipe entity){
        equipeRepository.delete(entity);
    }

    @Override
    public List<Equipe> findAll() {
        return equipeRepository.findAll();
    }
}
