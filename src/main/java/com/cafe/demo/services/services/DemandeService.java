package com.cafe.demo.services.services;

import com.cafe.demo.entities.Demande;
import java.util.List;


public interface DemandeService extends AbstractService<Demande> {

        List<Demande> programmeursWithNbrMax();
}
