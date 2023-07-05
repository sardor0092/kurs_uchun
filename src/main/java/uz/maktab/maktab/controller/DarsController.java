package uz.maktab.maktab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.maktab.entity.Bino;
import uz.maktab.maktab.entity.Dars;
import uz.maktab.maktab.service.DarsService;

@RestController
@RequestMapping("/dars")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class DarsController {

    @Autowired
    DarsService darsService;

    @GetMapping
    public Page<Dars> getll(@RequestParam(required = false) Pageable pageable){
        return darsService.getAll(pageable);

    }



    @PostMapping
    public Dars create(@RequestBody Dars dars){
        return  darsService.create(dars);
    }


    @PutMapping
    public Dars update(@RequestBody Dars dars){
        return darsService.update(dars);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        darsService.deleteById(id);
    }





}
