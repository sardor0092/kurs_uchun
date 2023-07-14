package uz.maktab.maktab.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.maktab.maktab.entity.Fan;


public interface FanService  extends GeneralService<Fan ,Number> {

    Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key , Pageable pageable);
}
