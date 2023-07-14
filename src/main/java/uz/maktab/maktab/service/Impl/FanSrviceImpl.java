package uz.maktab.maktab.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.maktab.entity.Fan;
import uz.maktab.maktab.repository.FanRepoaitory;
import uz.maktab.maktab.service.FanService;

import java.util.List;
import java.util.Optional;

@Service
public class FanSrviceImpl implements FanService {


    @Autowired
    FanRepoaitory fanRepoaitory;


    @Override
    public Page<Fan> getAll(Pageable pageable) {
        return fanRepoaitory.findAll(pageable);
    }

    @Override
    public Fan create(Fan data) {
        return fanRepoaitory.save(data);
    }

    @Override
    public Fan update(Fan data) {
        return fanRepoaitory.save(data);
    }

    @Override
    public void delete(Fan data) {

        fanRepoaitory.delete(data);

    }

    @Override
    public void deleteById(Long id) {

        fanRepoaitory.deleteById(id);

    }

    @Override
    public Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key, Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return  fanRepoaitory.findAllByNomContainsIgnoreCaseOrId(key ,n ,pageable);
        }
        catch (Exception f){
            return fanRepoaitory.findAllByNomContainsIgnoreCaseOrId(key,(long) -1, pageable);
        }
    }
}
