package com.example.services.map;

import com.example.model.Visit;
import com.example.repositories.VisitRepository;
import com.example.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findall() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
//        if(visit.getPet() == null  || visit.getPet().getOwner() == null || visit.getPet().getId()==null || visit.getPet().getOwner().getId() == null) {
//            throw new RuntimeException("Invalid visit");
//        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
