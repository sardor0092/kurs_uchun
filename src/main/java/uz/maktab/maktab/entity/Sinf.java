package uz.maktab.maktab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity

public class Sinf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nomi;
    private LocalDate boshlaganYili;

    public Sinf() {
    }

    public Sinf(Long id, String nomi, LocalDate boshlaganYili) {
        this.id = id;
        this.nomi = nomi;
        this.boshlaganYili = boshlaganYili;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public LocalDate getBoshlaganYili() {
        return boshlaganYili;
    }

    public void setBoshlaganYili(LocalDate boshlaganYili) {
        this.boshlaganYili = boshlaganYili;
    }
}
