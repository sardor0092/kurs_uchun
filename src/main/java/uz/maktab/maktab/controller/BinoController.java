package uz.maktab.maktab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.maktab.entity.Bino;
import uz.maktab.maktab.service.BinoService;

@RestController
@RequestMapping("/bino")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class BinoController {


    @Autowired
    BinoService binoService;

    @GetMapping
    public Page<Bino> getll(@RequestParam(required = false)Pageable pageable){
        return binoService.getAll(pageable);

    }


    @PostMapping
    public Bino create(@RequestBody Bino bino){
      return  binoService.create(bino);
    }


    @PutMapping
    public Bino update(@RequestBody Bino bino){
        return binoService.update(bino);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        binoService.deleteById(id);
    }





}
