package uz.maktab.maktab.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import uz.maktab.maktab.entity.Dars;
import uz.maktab.maktab.repository.DarsRepository;
import uz.maktab.maktab.service.DarsService;

@Service
public class DarsServiceImpl implements DarsService {

    @Autowired
    DarsRepository darsRepository;


    @Override
    public Page<Dars> getAll(Pageable pageable) {
        return darsRepository.findAll(pageable);
    }

    @Override
    public Dars create(Dars data) {
        return darsRepository.save(data);
    }

    @Override
    public Dars update(Dars data) {
        return darsRepository.save(data);
    }

    @Override
    public void delete(Dars data) {

        darsRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
   darsRepository.deleteById(id);
    }
}
