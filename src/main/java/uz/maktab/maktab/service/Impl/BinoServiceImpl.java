package uz.maktab.maktab.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.maktab.entity.Bino;
import uz.maktab.maktab.repository.BinoRepository;
import uz.maktab.maktab.service.BinoService;

@Service
public class BinoServiceImpl implements BinoService {

    @Autowired
    BinoRepository binoRepository;



    @Override
    public Page<Bino> getAll(Pageable pageable) {
        return binoRepository.findAll(pageable);
    }

    @Override
    public Bino create(Bino data) {
        return binoRepository.save(data);
    }

    @Override
    public Bino update(Bino data) {
        return binoRepository.save(data);
    }

    @Override
    public void delete(Bino data) {
        binoRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {

        binoRepository.deleteById(id);

    }
}
