package uz.maktab.maktab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.maktab.entity.Fan;
import uz.maktab.maktab.service.FanService;

@RestController
@RequestMapping("/fan")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class FanController {


    @Autowired
    FanService fanService;



    @GetMapping
    public Page<Fan> getAll(@RequestParam(required = false) String key , Pageable  pageable){
        if(key ==null) key = "";
        return fanService.getAll(pageable);
    }

    @PostMapping
    public Fan create(@RequestBody Fan  fan){
        return fanService.create(fan);
    }

    @PutMapping

    public Fan update(@RequestBody Fan  fan){
        return fanService.update(fan);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        fanService.deleteById(id);
    }




}
