package com.example.services.map;

import com.example.model.Speciality;
import com.example.model.Vet;
import com.example.services.CrudService;
import com.example.services.SpecialtyService;
import com.example.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findall() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialitySet().size()>0) {
            object.getSpecialitySet().forEach(speciality -> {
                if(speciality.getId()==null) {
                    Speciality savedSpeciality1 = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality1.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
