package com.cafe.demo.services.servicesImpl;

import com.cafe.demo.entities.Cafe;
import com.cafe.demo.repositories.CafeRepository;
import com.cafe.demo.services.services.CafeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CafeServiceImpl implements CafeService {
    private final CafeRepository cafeRepository;

    public CafeServiceImpl(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }

    @Override
    public Object save(Cafe entity) {
        return cafeRepository.save(entity);
    }

    @Override
    public void update(Cafe entity) {
         this.cafeRepository.save(entity);
    }

    @Override
    public void delete(Cafe entity){
         cafeRepository.delete(entity);
    }

    @Override
    public List<Cafe> findAll() {
        return cafeRepository.findAll();
    }
}
